package com.affairsAndNewFunction.service;

import com.affairsAndNewFunction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 韩帅比
 * @create 2022-03-31 19:49
 */
@Service
@Transactional(rollbackFor = Exception.class, readOnly = false, timeout = -1, propagation = Propagation.REQUIRED,
                isolation = Isolation.REPEATABLE_READ)
//传播行为默认是required; MySQL默认隔离级别是REPEATABLE_READ; 超时时间默认-1，表示不超时; readOnly默认false，表示不仅仅可读，
// 还可添加修改删除; rollbackFor填入指定的异常的class即可
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney(){
        //声明式事务管理（已按照步骤配置完毕）
        userDao.subtractMoney();
        //模拟异常
//        int a = 10 / 0;
        userDao.addMoney();

        //编程式事务管理
//        try {
//            //1.开启事务
//
//            //2.进行业务操作
//
//            //lucy少100
//            userDao.subtractMoney();
//
//            //模拟异常
//            int a = 10 / 0;
//
//            //mary多100
//            userDao.addMoney();
//
//            //3.未发生异常，提交事务
//
//        }catch (Exception e){
//            //4.若出现异常，事务回滚
//
//        }

    }
}
