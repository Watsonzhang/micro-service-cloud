package com.yunhe.cloud.controller;

import com.yunhe.cloud.entities.Consumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public  String hello(){
        return "hello world";
    }
    @GetMapping("/user/{id}")
    public Consumer getUser(@PathVariable Integer id){
        return new Consumer("小王",10);

    }
}
