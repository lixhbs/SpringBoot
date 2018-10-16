package com.cyinfotech.springbootsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSiApplication.class, args);
    }

    @RequestMapping("/")
    public String getIndex () {

        return "Hello Spring Boot";
    }
}
