package com.ioc.spring5_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 韩帅比
 * @create 2022-03-27 23:57
 */
@Configuration //把当前类作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.ioc.spring5_annotation"})
public class SpringConfig {

}
