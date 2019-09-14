package com.xueqing.demo.springbootsecurity.mapper;

import com.xueqing.demo.springbootsecurity.bean.Book;
import com.xueqing.demo.springbootsecurity.bean.Content;
import com.xueqing.demo.springbootsecurity.bean.T_installunit;
import com.xueqing.demo.springbootsecurity.bean.T_useunit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {


    @Select("SELECT * FROM t_brand where brand_id like '%${brand_id}%'")
    List<Book> list();

    /*@Insert("insert into t_brand (brand_id,productionunit_id,brand_name,brand_describe) values(#{brand_id},#{productionunit_id},#{brand_name},#{brand_describe})")*/
    @Insert("INSERT INTO t_brand (brand_id, productionunit_id, brand_name, brand_describe) VALUES (#{brand_id}, #{productionunit_id}, #{brand_name}, #{brand_describe})")
    void add(Book book);

    @Select("SELECT * FROM T_installunit")
    List<T_installunit> unit();

    @Select("SELECT * FROM T_useunit")
    List<T_useunit> useunit();

    @Select("SELECT * FROM t_brand where brand_id like '%${brand_id}%'")
    List<Book> mohu(Book book);

    @Select("SELECT * FROM content")
    List<Content> content();

    @Select("SELECT * FROM t_brand")
    List<Book> export();

    @Insert("insert into t_brand values(default,#{brand_id},#{productionunit_id},#{brand_name},#{brand_describe})")
    void importBooks(Book book);


  /*  @Insert("insert into t_brand values(default,#{brand_id},#{productionunit_id},#{brand_name},#{brand_describe})")
    List<Book> export();*/

}
