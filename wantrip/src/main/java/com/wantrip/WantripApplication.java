package com.wantrip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 湾旅服务
 * Created by junfeng on 17-11-21.
 */
@MapperScan("com.wantrip.dao")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableTransactionManagement
public class WantripApplication {

    public static void main(String[] args) {
        SpringApplication.run(WantripApplication.class, args);
    }
}
