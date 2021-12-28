package com.zhao.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboZhaoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboZhaoServiceApplication.class, args);
    }

}
