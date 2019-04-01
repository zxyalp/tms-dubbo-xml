package com.hello.tms.boot.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubbo
@ImportResource(value = {"classpath:spring/dubbo-provider.xml"})
public class TmsDubboXmlProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDubboXmlProviderApplication.class, args);
    }

}
