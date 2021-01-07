package com.yjl.boot.myboot01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
@Slf4j
class Myboot01ApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    @DisplayName("≤‚ ‘redis")
    void contextLoads() {
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set("username", "jlyou");

        final String username = stringStringValueOperations.get("username");

        log.info("----username:{}", username);


    }

}
