package com.example.redi_swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RediSwaggerApplication {
    static final Logger log = LoggerFactory.getLogger(RediSwaggerApplication.class);

    public static void main(String[] args) {
        log.info("All done successfully!!");
        SpringApplication.run(RediSwaggerApplication.class, args);
    }

}
