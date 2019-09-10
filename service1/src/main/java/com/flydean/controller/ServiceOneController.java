package com.flydean.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wayne
 * @version ServiceOneController,  2019/9/9 5:37 下午
 */
@Slf4j
@RestController
@RequestMapping("/serviceOne")
public class ServiceOneController {

    @GetMapping("callServiceOne")
    public String callServiceOne(){
        log.info("service one is called!");
        restTemplate().getForObject("http://localhost:9000/serviceTwo/callServiceTwo",String.class);
        return "service one and two are called!";
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
