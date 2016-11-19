package com.kaiyuan.dfb.mobilecenter.commons.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/12
 */
public class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    /**
     * 将json转换成对象
     *
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T toObj(String json, Class<T> clazz) {
        logger.debug("###json={}转换成对象###", json);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return objectMapper.readValue(json, clazz);
        } catch (IOException e) {
            logger.error("###json={}转换成对象失败###", json, e);
            return null;
        }
    }

    /**
     * 对象转json
     *
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        //null属性不进行序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("###对象obj={}转json出错###", obj, e);
        }
        return null;
    }

    public static <T> T getObject(JsonNode json, Class<T> clazz) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            //设置时间格式
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            mapper.setDateFormat(fmt);
            return mapper.treeToValue(json, clazz);
        } catch (JsonProcessingException e) {
            logger.error("###对象json={}转{}出错###错误信息:", json, clazz, e);
            return null;
        }
    }

    public static <T> JsonNode toJsonNode(T object) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.valueToTree(object);
        } catch (IllegalArgumentException e) {
            logger.error("###对象obj={}转json出错###", object, e);
            return null;
        }
    }

    public static ObjectNode newObject() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper.createObjectNode();
    }
}
