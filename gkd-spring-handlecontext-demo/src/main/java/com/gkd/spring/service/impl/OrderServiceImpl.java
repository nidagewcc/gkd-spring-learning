package com.gkd.spring.service.impl;

import com.gkd.spring.model.OrderDTO;
import com.gkd.spring.service.IOrderService;

/**
 * 传统实现
 *
 * @author Weishuo Zhang
 * @date 2019/9/29
 * @description
 */
public class OrderServiceImpl implements IOrderService {


    /**
     * 有点想简单工厂模式？？
     *
     * @param dto 订单实体
     * @return
     */
    @Override
    public String handle(OrderDTO dto) {
        String type = dto.getType();
        if ("1".equals(type)) {
            return "处理普通订单";
        } else if ("2".equals(type)) {
            return "处理团购订单";
        } else if ("3".equals(type)) {
            return "处理促销订单";
        }
        return null;
    }
}
