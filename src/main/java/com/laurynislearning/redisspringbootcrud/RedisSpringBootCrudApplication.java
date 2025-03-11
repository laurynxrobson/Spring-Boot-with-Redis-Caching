package com.laurynislearning.redisspringbootcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisSpringBootCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSpringBootCrudApplication.class, args);
    }

}
