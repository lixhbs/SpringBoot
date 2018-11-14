package com.example.SpringBootDockerAliyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class SpringBootDockerAliyunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerAliyunApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public Object findUser (){
        Map<String, String> map = new HashMap<>();
        map.put("name", "aprcode.com");
        return map;
    }
}
