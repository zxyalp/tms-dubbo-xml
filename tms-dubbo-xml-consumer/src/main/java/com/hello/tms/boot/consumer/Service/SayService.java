package com.hello.tms.boot.consumer.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hello.tms.boot.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author alp.zxy
 * @date 2019/3/31
 */
@Component
public class SayService {

    @Reference
    HelloService helloService;

    public String say(String name){
        return helloService.sayHello(name);
    }

}
