package com.ioc.spring5_demon2.bean;

/**
 * @author 韩帅比
 * @create 2022-03-25 23:00
 */
public class Orders {
    //无参数构造
    public Orders() {
        System.out.println("第一步 执行无参构造创建bean实例");
    }

    private String oName;

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("第二部 调用set方法设置属性值");
    }

    //创建执行的初始化方法
    public void initMethod(){//这是普通的方法，要想他执行，需要配置，标签为init-method
        System.out.println("第三步 执行初始化方法");
    }

    //创建销毁方法
    public void destroyMethod(){//和初始化方法一样需要配置，标签为destroy-method，同时还需在主类手动执行销毁
        System.out.println("第五步 执行销毁的方法");
    }
}
