package com.affairsAndNewFunction.test;

import com.affairsAndNewFunction.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author 韩帅比
 * @create 2022-04-01 21:19
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:com/affairsAndNewFunction/MySqlConnect.xml")
@SpringJUnitConfig(locations = "classpath:com/affairsAndNewFunction/MySqlConnect.xml")//复合注解，取代上面两行的作用
public class JTest5 {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        userService.accountMoney();
    }
}
