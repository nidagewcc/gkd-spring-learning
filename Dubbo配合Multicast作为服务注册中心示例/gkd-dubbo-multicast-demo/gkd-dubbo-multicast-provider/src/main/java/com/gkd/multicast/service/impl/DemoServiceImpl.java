package com.gkd.multicast.service.impl;

import com.gkd.multicast.service.DemoService;

/**
 * 在服务提供方实现接口
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
