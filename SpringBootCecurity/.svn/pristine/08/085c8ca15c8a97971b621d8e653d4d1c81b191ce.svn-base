package com.xueqing.demo.springbootsecurity.mapper;

import com.xueqing.demo.springbootsecurity.bean.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface FormMapper {
    @Insert("INSERT INTO t_brand (brand_id, productionunit_id, brand_name, brand_describe) VALUES (#{brand_id}, #{productionunit_id}, #{brand_name}, #{brand_describe})")
    void add(Book book);

    @Delete("delete from t_brand where id=#{id}")
    void del(Book book);

    @Update("update set t_brand brand_id=#{brand_id},productionunit_id=#{productionunit_id},brand_name=#{brand_name},brand_describe=#{brand_describe},id=#{id}")
    void update(Book book);


}
