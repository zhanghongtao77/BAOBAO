package com.xueqing.demo.springbootsecurity.controller;

import com.xueqing.demo.springbootsecurity.bean.Book;
import com.xueqing.demo.springbootsecurity.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    /*@Autowired
    private FormService formService;

    @RequestMapping("toadd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("add")
    public String add(Book book){
        formService.add(book);
        return "redirect:list";
    }

    @RequestMapping("update")
    public String toupdate(){
        return "update";
    }

    @RequestMapping("update")
    public String update(Book book){
        formService.update(book);
        return "redirect:list";
    }

    @RequestMapping("del")
    public String del(Book book){
        formService.del(book);
        return "redirect:list";
    }*/


}
