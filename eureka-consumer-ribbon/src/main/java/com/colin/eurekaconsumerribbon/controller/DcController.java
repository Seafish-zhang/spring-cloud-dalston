package com.colin.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/23 0023
 * time: 下午 17:36
 * description:
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        return "[eureka-consumer-ribbon] :" + restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

}
