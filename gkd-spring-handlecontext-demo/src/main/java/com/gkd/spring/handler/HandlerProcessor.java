package com.gkd.spring.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Weishuo Zhang
 * @date 2019/9/29
 * @description
 */
@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLEER_PK = "com.gkd.spring.handler.biz";

    /**
     * 扫描@HandlerType，初始化HandlerContext，将其注册到spring容器
     *
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        Map<String, Class> handleMap = new HashMap<>(3);



    }
}
