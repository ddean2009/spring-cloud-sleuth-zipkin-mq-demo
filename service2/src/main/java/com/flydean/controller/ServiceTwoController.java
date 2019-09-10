package com.flydean.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version ServiceTwoController,  2019/9/9 5:40 下午
 */
@Slf4j
@RestController
@RequestMapping("/serviceTwo")
public class ServiceTwoController {

    @GetMapping("callServiceTwo")
    public String callServiceOne(){
        log.info("service two is called!");
        return "service two is called!";
    }
}
