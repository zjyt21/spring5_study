package com.affairsAndNewFunction.test;

import com.affairsAndNewFunction.config.TxConfig;
import com.affairsAndNewFunction.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author 韩帅比
 * @create 2022-03-31 20:59
 */
public class TestAffairs {
    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/affairsAndNewFunction/MySqlConnect.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/affairsAndNewFunction/xmlConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式风格创建对象，交给spring进行管理
    @Test
    public void testGenericApplicationContext(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2.调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class, () -> new User());
        //3.获取在spring注册的对象
//        User user = (User) context.getBean("com.affairs.test.User");//通过路径得到对象
        User user = (User) context.getBean("user1");//指定的名字得到对象
        System.out.println(user);
    }

}
