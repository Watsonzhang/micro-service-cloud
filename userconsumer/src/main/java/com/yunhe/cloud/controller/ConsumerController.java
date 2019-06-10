package com.yunhe.cloud.controller;

import com.yunhe.cloud.entities.Consumer;
import com.yunhe.cloud.feign.ConsumerServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerServiceFeign consumerServiceFeign;
    @GetMapping("/consumer/{id}")
    public Consumer getConsumerById(@PathVariable Integer id){
       return consumerServiceFeign.getById(id);
    }
}
