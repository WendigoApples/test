package com.annotations_testing.test;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoadingBean {
    public LazyLoadingBean() {
        System.out.println("LazyLoadingBean has been created, Good job!");
    }
}
