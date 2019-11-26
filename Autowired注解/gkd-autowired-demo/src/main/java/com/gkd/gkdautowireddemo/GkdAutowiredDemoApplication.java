package com.gkd.gkdautowireddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GkdAutowiredDemoApplication implements CommandLineRunner {

    @Autowired
    private DependencyB dependencyB;

    @Override
    public void run(String... args) throws Exception {
        //TestUtils.test();
        dependencyB.execute();

    }

    public static void main(String[] args) {
        SpringApplication.run(GkdAutowiredDemoApplication.class, args);
    }
}
