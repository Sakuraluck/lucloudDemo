package com.could.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//用于注册和发现服务。
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan
@EnableHystrix
public class FeignApplication {

    //spring cloud将我们的几个应用串联起来，各个服务之间互相通过restAPI调用，
    // Feign要优于ribbon，另外Eureka注册中心也可以换成zookeeper或者consul。
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
