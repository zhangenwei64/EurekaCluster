package com.aisino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.aisino.dao")
public class UseServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UseServerApplication.class,args);
    }
}
