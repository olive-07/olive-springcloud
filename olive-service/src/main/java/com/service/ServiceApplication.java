package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ServiceApplication.class, args);
        System.out.println("******************************************************");
        System.out.println(">>> service 服务已成功启动！");
        System.out.println("******************************************************");
    }
}
