package com.xueqing.demo.springbootsecurity.service;

import com.xueqing.demo.springbootsecurity.bean.Book;
import com.xueqing.demo.springbootsecurity.bean.Content;
import com.xueqing.demo.springbootsecurity.bean.T_installunit;
import com.xueqing.demo.springbootsecurity.bean.T_useunit;

import java.util.List;

public interface BookService {





    List<Book> list();


    List<T_installunit> unit();

    List<T_useunit> useunit();

    List<Book> mohu(Book book);

    List<Content> content();

    List<Book> export();

    void importBooks(Book book);

    void add(Book book);
}
