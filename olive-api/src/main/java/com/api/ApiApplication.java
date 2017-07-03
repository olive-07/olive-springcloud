package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableHystrix
@EnableFeignClients
public class ApiApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ApiApplication.class, args);
        System.out.println("******************************************************");
        System.out.println(">>> api 服务已成功启动！");
        System.out.println("******************************************************");
    }

//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate()
//    {
//        return new RestTemplate();
//    }
}
