package com.gkd.annotation;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        handleAnnotation();
    }

    // Spring的源码是真厉害。。。虽然看不懂，但是感觉确实很流弊

    private static void handleAnnotation() {
        Class demoClass = UserAnnotationDemo.class;
        for (Method method : demoClass.getMethods()) {
            SimpleAnnotation annotation = method.getAnnotation(SimpleAnnotation.class);
            if (annotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" value : " + annotation.value());
                System.out.println(" --------------------------- ");
            }
        }

    }
}
