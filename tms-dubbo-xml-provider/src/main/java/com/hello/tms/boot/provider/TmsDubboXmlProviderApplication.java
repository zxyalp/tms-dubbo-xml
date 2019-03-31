package com.hello.tms.boot.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:spring/*.xml"})
public class TmsDubboXmlProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDubboXmlProviderApplication.class, args);
    }

}
