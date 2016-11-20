package com.kaiyuan.platform.dfb.mobilecenter.core.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
@ImportResource("classpath:dubbo-provider.xml")
public class MobileProvider  {

    private static final Logger logger= LoggerFactory.getLogger(MobileProvider.class);

    public static void main(String[] args) throws Exception {
        logger.info("----mobile provider begin start up------");
        SpringApplication.run(MobileProvider.class, args);
        logger.info("----mobile provider started up------");
    }

}