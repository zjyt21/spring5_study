package com.ioc.spring5_annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 韩帅比
 * @create 2022-03-27 23:21
 */
@Repository(value = "userDaoImpl1") //不写则默认首字母小写,即userDaoImpl
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add................");
    }
}
