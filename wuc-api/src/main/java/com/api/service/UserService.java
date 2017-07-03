package com.api.service;

import com.api.service.impl.UserServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "WUC-SERVICE", fallback = UserServiceImpl.class)
public interface UserService
{
    @RequestMapping(value = "hi")
    String user(@RequestParam(value = "name") String name);
}
