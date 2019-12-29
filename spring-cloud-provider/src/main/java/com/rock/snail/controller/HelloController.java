package com.rock.snail.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: limin
 * @Date: 2019-12-28 23:35
 * @Description:
 */
@RestController
@Slf4j
public class HelloController {


    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(){
        log.info("provider path /hello");
        return " provider say hello by " + port +" in "+System.currentTimeMillis();
    }
}
