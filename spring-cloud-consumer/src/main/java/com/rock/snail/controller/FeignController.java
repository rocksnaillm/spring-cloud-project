package com.rock.snail.controller;

import com.rock.snail.feign.ProviderFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: limin
 * @Date: 2019-12-29 09:06
 * @Description:
 */
@RestController
@Slf4j
public class FeignController {


    @Autowired
    private ProviderFeign providerFeign;
    @GetMapping("/feign/hello")
    public String hello(){
        log.info("consumer path /feign/hello");
        return providerFeign.hello();
    }
}
