package com.xueqing.demo.springbootsecurity.service;

import com.xueqing.demo.springbootsecurity.bean.Book;

public interface FormService {
    void add(Book book);

    void del(Book book);

    void update(Book book);
}
