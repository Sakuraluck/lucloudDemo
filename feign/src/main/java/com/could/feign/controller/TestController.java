package com.could.feign.controller;

import com.could.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/name")
    public String testName(String name) {
        return testService.testName() + " " + name;
    }

    @GetMapping("/id")
    public String testId(String name) {
        return testService.testName() + " " + name;
    }
}
