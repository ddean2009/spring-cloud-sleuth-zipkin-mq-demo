package com.flydean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wayne
 * @version ServiceOneApp,  2019/9/9 5:21 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceOneApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOneApp.class, args);
    }
}