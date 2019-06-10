package com.yunhe.cloud.service;

import com.yunhe.cloud.entities.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;
    public Consumer getById(Integer id){
        Consumer forObject = restTemplate.getForObject("http://192.168.3.144:2100/user/"+id,Consumer.class);
        return forObject;
    }
}
