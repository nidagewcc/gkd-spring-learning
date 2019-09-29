package com.gkd.spring.handler.biz;

import com.gkd.spring.handler.AbstractHandler;
import com.gkd.spring.handler.HandleType;
import com.gkd.spring.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @author Weishuo Zhang
 * @date 2019/9/29
 * @description
 */
@Component
@HandleType("1")
public class NormalHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        System.out.println("是这普通订单处理逻辑。。。");
        return null;
    }
}
