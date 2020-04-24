package com.could.feign.controller;

import com.could.feign.service.PowerFeignClient;
import com.could.feign.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

   /* @Autowired
    RestTemplate restTemplate;

    private static final String POWER_URL = "http://SERVER-POWER";
    private static final String ORDER_URL = "http://SERVER-ORDER";

    @Autowired
    private PowerFeignClient    powerFeignClient;

    @RequestMapping("/getFeignPower.do")
    public R getFeignPower(){
        return R.success("操作成功",powerFeignClient.getPower());
    }


    @RequestMapping("/getPower.do")
    public R getPower(){
        return R.success("操作成功",restTemplate.getForObject(POWER_URL+"/getPower.do",Object.class));
    }*/

}
