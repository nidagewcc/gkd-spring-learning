package com.gkd.spring.handler;

import com.gkd.spring.model.OrderDTO;

/**
 * 抽象处理器 AbstractHandler
 *
 * @author Weishuo Zhang
 * @date 2019/9/29
 * @description
 */
public abstract class AbstractHandler {

    public abstract String handle(OrderDTO dto);
}
