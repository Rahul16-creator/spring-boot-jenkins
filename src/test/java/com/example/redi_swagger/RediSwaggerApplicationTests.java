package com.example.redi_swagger;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RediSwaggerApplicationTests {

    static final Logger log = LoggerFactory.getLogger(RediSwaggerApplication.class);


    @Test
    void contextLoads() {
        log.info("Test cases executed successfully!!");
    }


}
