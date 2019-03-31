package com.hello.tms.boot.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hello.tms.boot.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author alp.zxy
 * @date 2019/3/31
 */
@RestController
public class HelloController {
    @Reference
    HelloService helloService;

    @GetMapping("sayHello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }

}
