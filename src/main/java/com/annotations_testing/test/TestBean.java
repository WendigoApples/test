package com.annotations_testing.test;

import org.springframework.context.annotation.Bean;

public class TestBean {

    @Bean
    public void method() {
        System.out.println("This is your TestBean method logic speaking!!!");
    }
}
