package com.montana.wiki.controller;


import com.montana.wiki.domain.Demo;
import com.montana.wiki.service.DemoServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {
    @Resource
    private DemoServer demoServer;
    @GetMapping("/demo/list")
    public List<Demo> list(){
        return demoServer.list();
    }
}
