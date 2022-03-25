package com.hlp.spring5_demon2.collectiontype;

/**
 * 课程类
 *
 * @author 韩帅比
 * @create 2022-03-25 19:42
 */
public class Course {
    private String cName;//课程名称

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
