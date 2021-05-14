package com.sei.springjenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void smokeTest() {
        assert "Hello".equals("Hello");
    }

}
