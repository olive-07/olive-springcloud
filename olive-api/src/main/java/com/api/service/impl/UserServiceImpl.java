package com.api.service.impl;

import com.api.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class UserServiceImpl implements UserService
{
    @Override
    public String user(@RequestParam(value = "name") String name)
    {
        return "系统错误=" + name;
    }
}
