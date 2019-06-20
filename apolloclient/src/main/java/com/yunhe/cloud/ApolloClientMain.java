package com.yunhe.cloud;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @version 1.0
 * @description 主启动类
 * @Author zhangwei
 * @Date 2019-06-20 17:19
 */
@EnableApolloConfig
@SpringBootApplication
public class ApolloClientMain {
    public static void main(String[] args) {
        SpringApplication.run(ApolloClientMain.class,args);
    }
}
