package com.hqs.springboot.shutdowndemo.config;


import com.hqs.springboot.shutdowndemo.bean.TerminateBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangqingshi
 * @Date 2019-08-17
 */
@Configuration
public class ShutDownConfig {

    @Bean
    public TerminateBean getTerminateBean() {
        return new TerminateBean();
    }

}
