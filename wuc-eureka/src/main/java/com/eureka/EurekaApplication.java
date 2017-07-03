package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("******************************************************");
        System.out.println(">>> 注册中心服务已成功启动！");
        System.out.println("******************************************************");
    }
}
