package com.hlp.spring5_demon2.collectiontype;

import java.util.List;

/**
 * @author 韩帅比
 * @create 2022-03-25 20:05
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void test(){
        System.out.println(list);
    }
}
