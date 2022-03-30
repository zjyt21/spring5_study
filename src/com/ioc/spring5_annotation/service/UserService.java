package com.ioc.spring5_annotation.service;

import com.ioc.spring5_annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 在注解里面value属性值可以省略不屑，
 * 默认是类名称，首字母小写，如 UserService -> userService
 *
 * @author 韩帅比
 * @create 2022-03-27 22:01
 */
//@Component(value = "userService") //等于<bean id="" class=""/>
@Service
public class UserService {
    /**定义dao类型属性
        不需要添加set方法
        添加注入属性注解
     */
    //建议用autowired和qualifier
    @Autowired //根据类型进行注入
    @Qualifier(value = "userDaoImpl1") //根据名称注入
    private UserDao userDao;

//    @Resource //根据类型进行注入
//    @Resource (name = "userDaoImpl1")//根据名称进行注入
//    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("service add............" + name);
        userDao.add();
    }
}
