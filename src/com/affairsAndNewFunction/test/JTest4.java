package com.affairsAndNewFunction.test;

import com.affairsAndNewFunction.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 韩帅比
 * @create 2022-04-01 21:07
 */
@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架的版本
@ContextConfiguration("classpath:com/affairsAndNewFunction/MySqlConnect.xml")//加载配置文件
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
