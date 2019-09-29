package com.gkd.spring.handler;

import java.lang.annotation.*;

/**
 * 自定义注解 @HandlerType
 *
 * @author Weishuo Zhang
 * @date 2019/9/29
 * @description
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandleType {

    String value();
}
