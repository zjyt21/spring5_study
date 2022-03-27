package com.hlp.spring5_demon2.factorybean;

import com.hlp.spring5_demon2.collectiontype.Course;
import javafx.util.Pair;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 韩帅比
 * @create 2022-03-25 20:54
 */
public class MyBean implements FactoryBean<Course> {
    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

}
