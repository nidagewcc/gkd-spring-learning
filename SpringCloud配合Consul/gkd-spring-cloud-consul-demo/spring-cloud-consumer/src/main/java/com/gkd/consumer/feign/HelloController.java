package com.gkd.consumer.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloService {

    @Autowired
    private HelloService helloService;

    @Override
    public String sayHello() {
        return helloService.sayHello();
    }
}
