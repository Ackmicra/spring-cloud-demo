package com.dhcc.zpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 集成Hystrix服务保护
 * @author 赵朋超
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrixApplication7005 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication7005.class, args);
    }
}
