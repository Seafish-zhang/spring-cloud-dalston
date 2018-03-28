package com.colin.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/23 0023
 * time: 上午 10:31
 * description:
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
//        Thread.sleep(5000L);
        String services = "[eureka-client] : Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
