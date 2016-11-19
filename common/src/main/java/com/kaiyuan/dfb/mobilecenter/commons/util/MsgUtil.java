package com.kaiyuan.dfb.mobilecenter.commons.util;

import com.kaiyuan.dfb.mobilecenter.commons.constant.CodeMsgEnum;
import com.kaiyuan.dfb.mobilecenter.commons.constant.CodeMsgMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 错误码对应的描述工具类
 * @author yangzhibin@che001.com
 * @date 2016/9/6
 */
public class MsgUtil {

    private static final Logger logger= LoggerFactory.getLogger(MsgUtil.class);
    /**
     * 返回错误码对应的描述信息,如果为空则返回服务器内部错误
     * @param key
     * @return
     */
    public static CodeMsgEnum getMsg(String key){
        CodeMsgEnum codeMsg=CodeMsgEnum.INTERNAL_SERVER_ERROR;
        try{
            codeMsg=CodeMsgEnum.valueOf(key);
        }catch (Exception e){
            logger.error("###获取错误信息出错,错误原因:",e);
        }
        return codeMsg;
    }

    /**
     * 根据Map的信息进行匹配
     * 返回错误码对应的描述信息,如果为空则返回服务器内部错误(根据MAP进行匹配)
     * @param key
     * @return
     */
    public static CodeMsgEnum getMapMsg(String key){
        CodeMsgEnum codeMsg=CodeMsgEnum.INTERNAL_SERVER_ERROR;
        try{
           if(CodeMsgMap.getCodeMsgEnumMap().get(key)!=null){
               codeMsg= CodeMsgMap.getCodeMsgEnumMap().get(key);
           }
        }catch (Exception e){
            logger.error("###获取错误信息出错,错误原因:",e);
        }
        return codeMsg;
    }
}
