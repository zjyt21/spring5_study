package com.aop.aop_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强的类
 *
 * @author 韩帅比
 * @create 2022-03-29 20:36
 */
@Component
@Aspect  //生成代理对象
@Order(3)
public class UserProxy {

    //把相同切入点进行抽取
    @Pointcut(value = "execution(* com.aop.aop_annotation.User.add(..))")
    public void pointDemo(){

    }

    //前置通知
    //Before注解表示作为前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before.......");
    }

    //最终通知
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after...........");
    }

    //后置通知，返回通知
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning...........");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing...........");
    }

    //环绕通知
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前...........");

        //执行被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...........");
    }
}
