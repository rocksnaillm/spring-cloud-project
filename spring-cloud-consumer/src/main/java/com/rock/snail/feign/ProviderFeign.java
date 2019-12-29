package com.rock.snail.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: limin
 * @Date: 2019-12-29 09:05
 * @Description:
 */
@FeignClient(value = "provider")
public interface ProviderFeign {
    @GetMapping("/hello")
    public String hello();
}
