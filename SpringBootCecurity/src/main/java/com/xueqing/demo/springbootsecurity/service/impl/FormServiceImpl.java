package com.xueqing.demo.springbootsecurity.service.impl;

import com.xueqing.demo.springbootsecurity.bean.Book;
import com.xueqing.demo.springbootsecurity.mapper.FormMapper;
import com.xueqing.demo.springbootsecurity.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements FormService {
    @Autowired
    private FormMapper formMapper;


    @Override
    public void add(Book book) {
        formMapper.add(book);
    }

    @Override
    public void del(Book book) {
        formMapper.del(book);
    }

    @Override
    public void update(Book book) {
        formMapper.update(book);
    }
}
