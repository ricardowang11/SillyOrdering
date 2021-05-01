package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        char a = '2';
        char b = '0';
        int c= a-b;
        System.out.println(a-b);
    }

}
