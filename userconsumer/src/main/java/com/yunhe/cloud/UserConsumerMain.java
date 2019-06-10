package com.yunhe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @param
 * @return 这是客户端消费
 * @Author zhangwei
 * @Date 2019-06-10 15:29
 */
@SpringBootApplication
@EnableEurekaClient
public class UserConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerMain.class,args);
    }
}
