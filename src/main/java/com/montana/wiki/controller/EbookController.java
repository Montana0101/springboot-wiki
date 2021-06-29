package com.montana.wiki.controller;


import com.montana.wiki.request.EbookReq;
import com.montana.wiki.response.CommonRes;
import com.montana.wiki.response.EbookRes;
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
    public CommonRes list(EbookReq req){
       CommonRes<List<EbookRes>> res = new CommonRes<>();
       List<EbookRes> list = ebookServer.list(req);
       res.setContent(list);
       return res;
    }
}
