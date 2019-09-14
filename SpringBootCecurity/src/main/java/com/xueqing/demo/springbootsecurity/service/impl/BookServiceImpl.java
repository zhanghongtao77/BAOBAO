package com.xueqing.demo.springbootsecurity.service.impl;

import com.xueqing.demo.springbootsecurity.bean.Book;
import com.xueqing.demo.springbootsecurity.bean.Content;
import com.xueqing.demo.springbootsecurity.bean.T_installunit;
import com.xueqing.demo.springbootsecurity.bean.T_useunit;
import com.xueqing.demo.springbootsecurity.mapper.BookMapper;
import com.xueqing.demo.springbootsecurity.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> list() {
        return bookMapper.list();
    }

    @Override
    public List<T_installunit> unit() {
        return bookMapper.unit();
    }

    @Override
    public List<T_useunit> useunit() {
        return bookMapper.useunit();
    }

    @Override
    public List<Book> mohu(Book book) {
        return bookMapper.mohu(book);
    }

    @Override
    public List<Content> content() {
        return bookMapper.content();
    }

    @Override
    public List<Book> export() {
        return bookMapper.export();
    }

    @Override
    public void importBooks(Book book) {
        bookMapper.importBooks(book);
    }

    @Override
    public void add(Book book) {
        bookMapper.add(book);
    }


}
