package com.gkd.gkdautowireddemo;

import org.springframework.stereotype.Service;

@Service
public class DependencyA {

    public void test() {
        System.out.println("Hello World");
    }
}
