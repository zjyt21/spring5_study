package com.ioc.spring5_demon1.bean;

/**
 * 部门类
 *
 * @author 韩帅比
 * @create 2022-03-25 16:52
 */
public class Dept {
    private String dName;

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
