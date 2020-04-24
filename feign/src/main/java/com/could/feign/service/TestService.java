package com.could.feign.service;

import com.could.feign.rpc.GetTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private GetTest getTest; //注入rpc

    public String testName(){
        return getTest.testName();
    }
}
