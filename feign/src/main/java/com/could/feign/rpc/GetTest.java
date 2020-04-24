package com.could.feign.rpc;

import com.could.feign.service.TestServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ribbon-consumer")
public interface GetTest {
    @RequestMapping(value = "/consumername?name=feigin",method = RequestMethod.GET)
    public String testName();
}
