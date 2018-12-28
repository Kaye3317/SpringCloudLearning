package com.kaye.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${test.config}")
    private String test;

    @GetMapping("index")
    public String index() {
        return test;
    }

}
