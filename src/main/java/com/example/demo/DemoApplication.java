package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@Slf4j
// @EnableOpenApi
@MapperScan(basePackages = {"com.example.demo.mapper"})
public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        log.info("SpringBoot开始加载");
        SpringApplication.run(DemoApplication.class, args);
        log.info("SpringBoot加载完成");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(DemoApplication.class);
    }
}
