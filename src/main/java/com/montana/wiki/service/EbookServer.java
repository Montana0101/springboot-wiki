package com.montana.wiki.service;

import com.montana.wiki.domain.Ebook;
import com.montana.wiki.domain.EbookExample;
import com.montana.wiki.mapper.EbookMapper;
import com.montana.wiki.request.EbookReq;
import com.montana.wiki.response.EbookRes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookServer {

    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookRes> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike( "%" + req.getName()+ "%");
        List<Ebook> ebookList =  ebookMapper.selectByExample(ebookExample);

        List<EbookRes> resList = new ArrayList<>();
        for(Ebook ebook:ebookList){
            EbookRes ebookres = new EbookRes();
            BeanUtils.copyProperties(ebook,ebookres);
            resList.add(ebookres);
        }
        return resList;
    }
}
