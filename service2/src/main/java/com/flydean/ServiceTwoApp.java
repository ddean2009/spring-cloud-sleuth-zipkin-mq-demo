package com.flydean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wayne
 * @version ServiceTwoApp,  2019/9/9 5:22 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceTwoApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTwoApp.class, args);
    }
}
