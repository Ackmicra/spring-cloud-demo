package com.dhcc.zpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 赵朋超
 * @EnableFeignClients 测试负载均衡，启动springcloud-eureka-7001（注册中心），producer-service-7006（生产者），
 *              consumer-service-7007（消费者），使用postman访问消费者http://127.0.0.1:7007/hello?name=admin，
 *              自动分发到生产者，返回【hello admin】
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerApplication7007 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication7007.class, args);
    }
}
