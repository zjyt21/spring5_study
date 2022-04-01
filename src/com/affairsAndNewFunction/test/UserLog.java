package com.affairsAndNewFunction.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 韩帅比
 * @create 2022-04-01 19:53
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
