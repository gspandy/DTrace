package com.kaiyuan.dfb.mobilecenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(exclude={MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ImportResource("classpath:springMvc.xml")
public class MobileApi extends WebMvcConfigurerAdapter {

    private static final Logger logger= LoggerFactory.getLogger(MobileApi.class);

    public static void main(String[] args) throws Exception {
        logger.info("----mobile api begin start up------");
        SpringApplication.run(MobileApi.class, args);
        logger.info("----mobile api started up------");
    }
}