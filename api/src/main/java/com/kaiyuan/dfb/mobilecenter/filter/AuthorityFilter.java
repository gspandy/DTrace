package com.kaiyuan.dfb.mobilecenter.filter;

import com.alibaba.dubbo.rpc.*;
import com.kaiyuan.dfb.mobilecenter.commons.annotation.Trace;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AuthorityFilter implements Filter {

    //自定义日志级别
    private static final Logger monitorLogger = LoggerFactory.getLogger("monitor");

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        Result result = null;
        try {
            //traceId
            String traceId=RpcContext.getContext().getAttachment("traceId");
            if(StringUtils.isBlank(traceId)){
                traceId=String.valueOf(System.currentTimeMillis());
                RpcContext.getContext().setAttachment("traceId",traceId);
            }
            //获取调用者ip
            String clientIp = RpcContext.getContext().getRemoteHost();
            //获取调用的类名
            Class clazz=invoker.getInterface();
            //调用的方法名
            String methodName=invocation.getMethodName();
            //获取参数
            String arguments=Arrays.toString(invocation.getArguments());
            Method method = invoker.getInterface().getMethod(invocation.getMethodName(), invocation.getParameterTypes());
            Trace trace = method.getAnnotation(Trace.class);
            String spanId=trace.spanId();
            //parentId
            String parentId=RpcContext.getContext().getAttachment("parentId");
            if(StringUtils.isBlank(parentId)){
                parentId="ROOT";
                //传递给生产者,如果生产者继续调用的话需要获取parentId为其当前spanId
                RpcContext.getContext().setAttachment("parentId",spanId);
            }
            long start = System.currentTimeMillis();
            result = invoker.invoke(invocation);
            //方法耗时
            long elapsed = System.currentTimeMillis() - start;
            monitorLogger.info("###{}#{}#{}#{}#{}#{}#{}#{}#{}#{}###",traceId,spanId,parentId,clientIp,clazz,methodName,arguments,elapsed,result.getException(),result.getValue());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }
}