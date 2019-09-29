package com.gkd.spring.service;

import com.gkd.spring.model.OrderDTO;

/**
 * @author Weishuo Zhang
 * @date 2019/9/29
 * @description
 */
public interface IOrderService {
    /**
     * 根据订单的不同类型作出不同的处理
     *
     * @param dto 订单实体
     * @return 为了简单，返回字符串
     */
    String handle(OrderDTO dto);
}
