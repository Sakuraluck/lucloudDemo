package com.could.ribbonconsumer.controller;

import com.could.ribbonconsumer.service.ConsumerTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerTestController {

    @Autowired
    private ConsumerTestService consumerTestService;

    @GetMapping("/consumername")
    public String consumerTestname(String name){
        return consumerTestService.consumerTestName()+" "+name;
    }
}
