package com.gkd.spring.service.impl;

import com.gkd.spring.handler.HandleContext;
import com.gkd.spring.model.OrderDTO;
import com.gkd.spring.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 策略模式
 *
 * @author Weishuo Zhang
 * @date 2019/9/29
 * @description
 */
public class OrderServiceV2Impl implements IOrderService {

    @Autowired
    private HandleContext handleContext;

    @Override
    public String handle(OrderDTO dto) {

        return null;
    }
}
