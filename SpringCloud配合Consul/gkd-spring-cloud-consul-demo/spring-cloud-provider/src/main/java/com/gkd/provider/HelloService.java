package com.gkd.provider;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloService {

    @GetMapping("/say")
    String sayHello();
}
