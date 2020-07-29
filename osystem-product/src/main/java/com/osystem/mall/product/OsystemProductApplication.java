package com.osystem.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.osystem.mall.product.dao")
@SpringBootApplication
public class OsystemProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(OsystemProductApplication.class, args);
    }

}
