package com.rock.snail.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: limin
 * @Date: 2019-12-28 23:53
 * @Description:
 */
@RestController
@Slf4j
public class RibbonController {

    //这里注入的restTemplate就是在com.sam.ConsumerApp中通过@Bean配置的实例
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/say/hello/ribbon")
    public String ribbon(){
        log.info("consumer path /say/hello/ribbon");
        String result = restTemplate.getForObject("http://provider/hello", String.class);
        return result;
    }
}
