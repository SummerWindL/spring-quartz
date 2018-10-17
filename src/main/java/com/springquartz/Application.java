package com.springquartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 你的名称
 * @createTime 20181017 22:49
 * @description 启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.springquartz"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}