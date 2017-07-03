package com.api.controller;

import com.api.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController
{
//    @Resource
//    private RestTemplate restTemplate;
    @Resource
    private UserService userService;

//    @RequestMapping("/user")
//    @HystrixCommand(fallbackMethod = "hiError")
//    public String user()
//    {
//        return restTemplate.getForObject("http://WUC-SERVICE/hi?name=" + "wucan", String.class);
//    }
//    public String hiError(String name) {
//        return "hi,"+name+",sorry,error!";
//    }

    
    @RequestMapping("/user1")
    public String user1()
    {
        return userService.user("wuvcan");
    }
}
