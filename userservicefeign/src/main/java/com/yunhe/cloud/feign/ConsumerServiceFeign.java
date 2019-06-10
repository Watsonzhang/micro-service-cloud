package com.yunhe.cloud.feign;

import com.yunhe.cloud.entities.Consumer;
import com.yunhe.cloud.feign.fallback.ConsumerServiceFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USERSERVICE",fallback = ConsumerServiceFeignFallBack.class)
public interface ConsumerServiceFeign {
    @RequestMapping("/user/{id}")
    public Consumer getById(@PathVariable Integer id);
}
