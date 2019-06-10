package com.yunhe.cloud.service;

import com.yunhe.cloud.entities.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    private  static  final  String PREFIX="http://USERSERVICE";
    @Autowired
    RestTemplate restTemplate;
    public Consumer getById(Integer id){
        Consumer forObject = restTemplate.getForObject(PREFIX+"/user/"+id,Consumer.class);
        return forObject;
    }
}
