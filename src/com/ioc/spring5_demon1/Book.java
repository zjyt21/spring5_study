package com.ioc.spring5_demon1;

/**
 * 演示使用set方法进行注入属性
 *
 * @author 韩帅比
 * @create 2022-03-24 0:05
 */
public class Book {
    private String bName;
    private String bAuthor;
    private String address;

    //创建属性对应的set方法
    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bName + "::" + bAuthor + "::" + address);
    }
}
