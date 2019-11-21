package com.dhcc.zpc;

import com.dhcc.zpc.rocketmq.producer.MQProducerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @author 赵朋超
 * @EnableEurekaClient 本服务启动后会自动注册进eureka服务中
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudUtilApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUtilApplication.class, args);
    }
}
