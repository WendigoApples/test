package com.annotations_testing.test.controller;


import com.annotations_testing.test.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @Autowired
    private TestBean testBean;


    @RequestMapping("/")
    public @ResponseBody String greeting() {
        testBean.method();
        return "Hello, World!";

    }
}
