package com.annotations_testing.test;

import org.springframework.stereotype.Component;


@Component
public class EagerLoadingBean {

    public EagerLoadingBean() {
        System.out.println("EagerLoadingBean has been created, Good job!");
    }

}
