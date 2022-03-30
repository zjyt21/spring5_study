package com.ioc.spring5_demon1.bean;

/**
 * @author 韩帅比
 * @create 2022-03-25 16:53
 */
public class Emp {
    private String eName;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;
    //生成dept的get方法

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(eName + "::" + gender + "::" + dept);
    }
}
