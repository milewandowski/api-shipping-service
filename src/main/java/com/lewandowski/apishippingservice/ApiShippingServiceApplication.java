package com.lewandowski.apishippingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiShippingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiShippingServiceApplication.class, args);
    }

}
