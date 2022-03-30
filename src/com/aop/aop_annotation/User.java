package com.aop.aop_annotation;

import org.springframework.stereotype.Component;

/**
 * 被增强类
 *
 * @author 韩帅比
 * @create 2022-03-29 20:36
 */
@Component
public class User {
    public void add(){
//        int a = 10 / 0;
        System.out.println("add........");
    }
}
