package com.rock.snail.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: limin
 * @Date: 2019-12-28 23:49
 * @Description:
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        log.info("consumer path /hello");
        return "consumer say hello";
    }
}
