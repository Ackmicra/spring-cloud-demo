package com.dhcc.zpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 赵朋超
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Oauth2Application7008 {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application7008.class, args);
    }
}
