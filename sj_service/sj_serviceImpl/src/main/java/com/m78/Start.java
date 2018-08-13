package com.m78;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.m78.mapper")
@ComponentScan(basePackages = "com.m78.*")
public class Start {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(Start.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}
