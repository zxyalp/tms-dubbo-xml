package com.hello.tms.boot.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring/*.xml")
public class TmsDubboXmlConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDubboXmlConsumerApplication.class, args);
    }

}
