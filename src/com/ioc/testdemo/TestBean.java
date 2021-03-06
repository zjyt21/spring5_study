package com.ioc.testdemo;

import com.ioc.spring5_demon1.bean.Emp;
import com.ioc.spring5_demon1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 韩帅比
 * @create 2022-03-25 1:19
 */
public class TestBean {
    @Test
    public void testBean2(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);//user是别名，体现在xml文件的<bean>标签中的id上
        userService.add();
    }
    @Test
    public void testBean3(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/bean3.xml");

        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);//user是别名，体现在xml文件的<bean>标签中的id上
        emp.add();
    }
    @Test
    public void testBean4(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/bean4.xml");

        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);//user是别名，体现在xml文件的<bean>标签中的id上
        emp.add();
    }
}
