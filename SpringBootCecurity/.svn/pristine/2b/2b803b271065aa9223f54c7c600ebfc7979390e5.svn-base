package com.xueqing.demo.springbootsecurity.controller;

import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.xueqing.demo.springbootsecurity.bean.Book;
import com.xueqing.demo.springbootsecurity.bean.Content;
import com.xueqing.demo.springbootsecurity.bean.T_installunit;
import com.xueqing.demo.springbootsecurity.bean.T_useunit;
import com.xueqing.demo.springbootsecurity.service.BookService;
import com.xueqing.demo.springbootsecurity.util.ExcelUtiles;
import com.xueqing.demo.springbootsecurity.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //查询电梯品牌
    @RequestMapping("/list.do")
    @ResponseBody
    public List<Book> list(String page,String mohu,HttpServletRequest request){
        if(mohu==null){
            mohu="";
        }
        List<Book>list=bookService.list();
        return list;
    }

/*    //添加
    @RequestMapping("/toadd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(Book book){
        bookService.add(book);
        return "list";
    }*/

    @PostMapping("/add.do")
    @ResponseBody
    public void add(@RequestBody Book book){
        bookService.add(book);

    }




    //查询安装单位
    @RequestMapping("/unit.do")
    @ResponseBody
    public List<T_installunit> unit(){

        List<T_installunit>unit=bookService.unit();
        return unit;
    }

    //查询正在使用的单位
    @RequestMapping("/useunit.do")
    @ResponseBody
    public List<T_useunit> useunit(){

        List<T_useunit>useunit=bookService.useunit();
        return useunit;
    }


    //电梯追溯
    @RequestMapping("/mohu.do")
    @ResponseBody
    public List<Book> mohu(@RequestBody Book book){
        return bookService.mohu(book);
    }

    //评论
    @RequestMapping("/content.do")
    @ResponseBody
    public List<Content> content(){
        List<Content>list=bookService.content();
        return list;
    }


    //报表导出
    @RequestMapping("/export.do")
    @ResponseBody
    public List<Book> export(HttpServletResponse response){

        List<Book>export=bookService.export();
        ExcelUtiles.exportExcel(export,"名称","品牌表",Book.class,"安全管理系统.xls",response);
        return export;
    }


    //报表导入
    @PostMapping(value = "/importExce.do",params ="text/html;charset=UTF-8")
    public void importExcel(@RequestParam("file") MultipartFile file){
        ImportParams importParams = new ImportParams();
        //数据处理
        importParams.setHeadRows(1);
        importParams.setTitleRows(1);
        //验证
        importParams.setNeedVerfiy(true);
        try {
            List<Book> books = ExcelUtiles.importExcel(file, 1, 1, Book.class);
            for (Book book : books) {
                System.out.println(book);
                bookService.importBooks(book);
            }

        }
        catch (Exception e) {

        }
    }






}
