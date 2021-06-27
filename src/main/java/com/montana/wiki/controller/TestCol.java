package com.montana.wiki.controller;


import com.montana.wiki.domain.Test;
import com.montana.wiki.service.TestServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestCol {
    @Value("${test.const}")
    private String test;

    @Resource
    private TestServer testServer;

    @RequestMapping("/hello")
    public String Hello () {
        return "Hello SpringBoot" + test;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testServer.list();
    }
}
