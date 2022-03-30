package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 韩帅比
 * @create 2022-03-29 23:58
 */
@Configuration
@ComponentScan(basePackages = {"com.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true) //默认是false
public class ConfigAop {
}
