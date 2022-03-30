package com.ioc.testdemo;

import com.ioc.spring5_demon1.Book;
import com.ioc.spring5_demon1.Orders;
import com.ioc.spring5_demon1.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 韩帅比
 * @create 2021-11-08 21:58
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //1.加载spring配置文件
        //ClassPathXmlApplicationContext是类路径，在src下。另一种方法：FileSystemXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);//user是别名，体现在xml文件的<bean>标签中的id上
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        //1.加载spring配置文件
        //ClassPathXmlApplicationContext是类路径，在src下。另一种方法：FileSystemXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/bean1.xml");

        //2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);//user是别名，体现在xml文件的<bean>标签中的id上
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/bean1.xml");
        //2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}
