package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringJUnitConfig
class MyServiceTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testMyService() {
        MyService myService = applicationContext.getBean(MyService.class);
        assertNotNull(myService);
    }

    @Configuration
    static class TestConfig {
        @Bean
        MyService myService() {
            return new MyServiceImpl();
        }
    }

    interface MyService {
        // методы сервиса
    }

    static class MyServiceImpl implements MyService {
        // реализация методов сервиса
    }
}