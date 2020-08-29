package com.gkd.eurekaconsumer;

import com.gkd.eurekaconsumer.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping("/test/say")
    public String testHello() {
        return helloClient.hello();
    }
}
