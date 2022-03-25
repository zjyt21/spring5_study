package com.hlp.spring5_demon2.autowire;

/**
 * @author 韩帅比
 * @create 2022-03-25 23:40
 */
public class Emp {
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void test(){
        System.out.println(dept);
    }
}
