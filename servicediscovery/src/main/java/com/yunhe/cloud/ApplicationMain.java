package com.yunhe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
/**
 *
 * @param
 * @return  这是一个eureka sever 服务中心
 * @Author zhangwei
 * @Date 2019-06-10 14:51
 */
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class,args);
    }
}
