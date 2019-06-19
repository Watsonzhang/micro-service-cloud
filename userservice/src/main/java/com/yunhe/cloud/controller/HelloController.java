package com.yunhe.cloud.controller;

import com.yunhe.cloud.entities.Consumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public  String hello(HttpServletRequest httpServletRequest){
        String x_auth_token = httpServletRequest.getHeader("X_Auth_Token");
        return  x_auth_token;
    }
    @GetMapping("/user/{id}")
    public Consumer getUser(@PathVariable Integer id){
        return new Consumer("小王",10);

    }
}
