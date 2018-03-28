package com.colin.eurekaconsumerfeign.controller;

import com.colin.eurekaconsumerfeign.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/23 0023
 * time: 下午 17:44
 * description:
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return "[eureka-consumer-feign] :" + dcClient.consumer();
    }

}
