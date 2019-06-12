package com.yunhe.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceMain.class,args);
    }
}
