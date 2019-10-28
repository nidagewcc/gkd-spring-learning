package com.gkd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
// 注解@EnableDiscoveryClient，声明这是一个Eureka Client。注解也可以使用@EnableEurekaClient，不同的是@EnableDiscoveryClient同时还可以作为Zookeeper、Consul中发现注解，作用范围更广一些。
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
