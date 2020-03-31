package com.dhcc.zpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 赵朋超
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication7006 {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication7006.class, args);
    }
}
