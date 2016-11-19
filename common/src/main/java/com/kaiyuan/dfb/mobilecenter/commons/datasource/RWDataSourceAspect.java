package com.kaiyuan.dfb.mobilecenter.commons.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author yangzhibin@che001.com
 * @Date 2016/4/20
 */
public class RWDataSourceAspect {

    private static final Logger logger= LoggerFactory.getLogger(RWDataSourceAspect.class);

    public void before(JoinPoint point){
        try {
            //获取拦截的对象
            Object target=point.getTarget();
            //获取拦截的对象的方法名称
            String method=point.getSignature().getName();
            //获取拦截的对象实现的接口
            Class<?>[] clazz=target.getClass().getInterfaces();
            //获取方法参数类型
            Class<?>[] parameterTypes=((MethodSignature)point.getSignature()).getMethod().getParameterTypes();
            //根据接口 方法名 方法参数 去获取具体的方法
            Method m=clazz[0].getMethod(method, parameterTypes);
            if(m!=null&&m.isAnnotationPresent(DataSource.class)){
                DataSource ds=m.getAnnotation(DataSource.class);
                RWDataSourceHolder.setDataSource(ds.value());
                logger.info("使用的数据源--->"+ds.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
