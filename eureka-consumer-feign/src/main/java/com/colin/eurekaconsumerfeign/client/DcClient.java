package com.colin.eurekaconsumerfeign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/23 0023
 * time: 下午 17:44
 * description:
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
