package com.gkd.gkdautowireddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestUtils {

    private static ClassA classA;

    @Autowired
    public TestUtils(ClassA classA) {
        TestUtils.classA = classA;
    }

    public static void test() {
        TestUtils.classA.test();
    }
}
