package com.yunhe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @param
 * @return  这是一个eureka客户端 提供服务
 * @Author zhangwei
 * @Date 2019-06-10 15:11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class UserServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceMain.class,args);
    }
}
