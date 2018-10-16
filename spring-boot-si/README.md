# Spring Boot | 使用Spring Initializr快速创建
> 简单快速搭建启动Spring Boot项目

[教程源码Github地址](https://github.com/lixhbs/SpringBoot/tree/master/spring-boot-si)   
[教程源码Gitee地址](https://gitee.com/Lixhbs/SpringBoot/tree/master/spring-boot-si)    
[博客地址](https://blog.aprcode.com/Spring-Boot-SI/)


- Create New Prject | 创建新项目
![](http://paz1myrij.bkt.clouddn.com/20181016113451.png)

- 选择 Spring Initializr
![](http://paz1myrij.bkt.clouddn.com/20181016113609.png)

- 填好信息选择下一步
![](http://paz1myrij.bkt.clouddn.com/20181016114713.png)

- 可以选择一些工具
![](http://paz1myrij.bkt.clouddn.com/20181016114810.png)

- 创建好后项目会开始初始化，等待一下
![](http://paz1myrij.bkt.clouddn.com/20181016115115.png)

- 修改启动类 `SpringBootSiApplication`

```Java
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

```

- 初始化完成后右上角启动|调试项目
![](http://paz1myrij.bkt.clouddn.com/20181016115258.png)

- 启动信息
![](http://paz1myrij.bkt.clouddn.com/20181016115339.png)

- 页面访问 'http://localhost:8080/'

![](http://paz1myrij.bkt.clouddn.com/20181016133457.png)


