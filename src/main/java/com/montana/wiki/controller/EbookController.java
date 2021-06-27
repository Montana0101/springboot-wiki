package com.montana.wiki.controller;


import com.montana.wiki.domain.Ebook;
import com.montana.wiki.response.CommonRsp;
import com.montana.wiki.service.EbookServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookServer ebookServer;
    @GetMapping("/list")
    public CommonRsp list(){
       CommonRsp<List<Ebook>> res = new CommonRsp<>();
       List<Ebook> list = ebookServer.list();
       res.setContent(list);
       return res;
    }
}
