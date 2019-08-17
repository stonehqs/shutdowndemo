package com.hqs.springboot.shutdowndemo.bean;

import javax.annotation.PreDestroy;

/**
 * @author huangqingshi
 * @Date 2019-08-17
 */
public class TerminateBean {

    @PreDestroy
    public void preDestroy() {
        System.out.println("TerminalBean is destroyed");
    }

}
