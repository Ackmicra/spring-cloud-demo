package com.dhcc.zpc;

import com.dhcc.zpc.filler.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author 赵朋超
 */
@SpringBootApplication
@EnableEurekaClient
/*
 * @EnableZuulProxy 加上这个注解启动就会报错
 */
@EnableZuulProxy
public class ZuulApplication7004 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication7004.class, args);
    }

    // 实例化tokenFilter,否则网管不生效
    @Bean
    TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
