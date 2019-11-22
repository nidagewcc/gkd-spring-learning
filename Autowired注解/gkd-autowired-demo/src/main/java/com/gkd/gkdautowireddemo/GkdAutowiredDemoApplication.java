package com.gkd.gkdautowireddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GkdAutowiredDemoApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        TestUtils.test();
    }

    public static void main(String[] args) {
        SpringApplication.run(GkdAutowiredDemoApplication.class, args);
    }
}
