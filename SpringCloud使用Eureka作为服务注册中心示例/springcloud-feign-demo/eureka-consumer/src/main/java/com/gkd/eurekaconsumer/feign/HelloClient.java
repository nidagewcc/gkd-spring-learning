package com.gkd.eurekaconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-provider")
public interface HelloClient {

    @GetMapping("/say")
    String hello();
}



