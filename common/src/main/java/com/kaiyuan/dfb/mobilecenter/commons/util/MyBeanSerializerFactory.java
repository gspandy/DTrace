package com.kaiyuan.dfb.mobilecenter.commons.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

public class MyBeanSerializerFactory extends BeanSerializerFactory{
    public static final MyBeanSerializerFactory instance = new MyBeanSerializerFactory((SerializerFactoryConfig)null);
    static {
        _concrete.put(Float.class.getName(), MyBeanSerializerFactory.MyFloatSerializer.instance);
        _concrete.put(Float.TYPE.getName(), MyBeanSerializerFactory.MyFloatSerializer.instance);
    }
    protected MyBeanSerializerFactory() {
        super(null);
    }
    protected MyBeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    @JacksonStdImpl
    public static final class MyFloatSerializer extends StdScalarSerializer<Float> {
        static final MyBeanSerializerFactory.MyFloatSerializer instance = new MyBeanSerializerFactory.MyFloatSerializer();

        public MyFloatSerializer() {
            super(Float.class);
        }

        public void serialize(Float var1, JsonGenerator var2, SerializerProvider var3) throws IOException, JsonGenerationException {
            DecimalFormat format = new DecimalFormat("0.00");
            var2.writeNumber(format.format(var1));
        }

        public JsonNode getSchema(SerializerProvider var1, Type var2) {
            return this.createSchemaNode("number", true);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper var1, JavaType var2) throws JsonMappingException {
            JsonNumberFormatVisitor var3 = var1.expectNumberFormat(var2);
            if(var3 != null) {
                var3.numberType(JsonParser.NumberType.FLOAT);
            }

        }
    }
}