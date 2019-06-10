package com.yunhe.cloud.feign;

import com.yunhe.cloud.entities.Consumer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("USERSERVICE")
public interface ConsumerServiceFeign {
    @RequestMapping("/user/{id}")
    public Consumer getById(@PathVariable Integer id);
}
