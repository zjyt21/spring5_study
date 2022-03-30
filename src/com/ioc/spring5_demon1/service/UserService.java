package com.ioc.spring5_demon1.service;

import com.ioc.spring5_demon1.dao.UserDao;

/**
 * @author 韩帅比
 * @create 2022-03-25 1:03
 */
public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add....................");
        userDao.update();
    }
}
