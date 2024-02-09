package com.annotations_testing.test.config;

import com.annotations_testing.test.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {

    @Bean
    public TestBean testBean() {
        return new TestBean();
    }


////    or we can do it like this to inject the bean when using a template
//    @Bean
//    public RestTemplate template() {
//        return new RestTemplate();
//    }
}
