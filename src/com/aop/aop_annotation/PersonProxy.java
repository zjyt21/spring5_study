package com.aop.aop_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 韩帅比
 * @create 2022-03-29 23:15
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    @After(value = "execution(* com.aop.aop_annotation.User.add(..))")
    public void after(){
        System.out.println("Person after..............");
    }

    @Around(value = "execution(* com.aop.aop_annotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Person环绕之前...........");

        //执行被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("Person环绕之后...........");
    }
}
