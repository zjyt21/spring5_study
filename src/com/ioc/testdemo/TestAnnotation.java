package com.ioc.testdemo;

import com.ioc.spring5_annotation.config.SpringConfig;
import com.ioc.spring5_annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 韩帅比
 * @create 2022-03-27 22:04
 */
public class TestAnnotation {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/spring5_annotation/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testPureAnnotation(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
