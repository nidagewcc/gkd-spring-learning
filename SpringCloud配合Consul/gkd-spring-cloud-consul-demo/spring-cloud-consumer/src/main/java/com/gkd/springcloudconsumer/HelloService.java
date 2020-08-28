package com.gkd.springcloudconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider")
public interface HelloService {

    @GetMapping("/say")
    String sayHello();
}
