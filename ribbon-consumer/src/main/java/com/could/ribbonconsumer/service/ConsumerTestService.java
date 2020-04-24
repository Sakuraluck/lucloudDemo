package com.could.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerTestService {
    @Autowired
    RestTemplate restTemplate; //注入resttemplate
    public String consumerTestName(){
        return restTemplate.getForObject("http://ribbon-provider/name?name=luck",String.class);
    }
    // cloud通过rest调用服务进行服务间的通信，每一个controller的方法对外提供对应的服务接口。相比较dubbo的rpc调用有一些不一样的优势，
    // 同时它的开发方式更简单，配合zuul网关的使用能够达到更好的效果。
}
