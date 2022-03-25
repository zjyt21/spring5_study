package com.hlp.spring5_demon2.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 韩帅比
 * @create 2022-03-25 23:21
 */
public class MyBeanPost implements BeanPostProcessor {
    //也需要配置,<bean id="myBeanPost" class="com.hlp.spring5_demon2.bean.MyBeanPost"></bean>
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前执行的方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后执行的方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
