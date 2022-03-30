package com.aop.test;

import com.aop.aop_annotation.User;
import com.aop.aop_xml.Book;
import com.aop.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 韩帅比
 * @create 2022-03-29 21:13
 */
public class TestAop {
    @Test
    public void testAopAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/bean_aopannotation.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/bean_aopxml.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.buy();
    }

    //完全注解开发
    @Test
    public void testPureAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
