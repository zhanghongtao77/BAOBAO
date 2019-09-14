package com.xueqing.demo.springbootsecurity.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface HighchartsMapper {

    @Select("SELECT\n" +
            "\tdt_pinpai3.name AS name,COUNT(install_unit) AS y\n" +
            "FROM\n" +
            "\tdt_sebei1\n" +
            "LEFT JOIN dt_pinpai3 ON dt_sebei1.install_unit = dt_pinpai3.id\n" +
            "GROUP BY\n" +
            "\tinstall_unit")
    List<Map<String, Object>> selectWorkloadAnalysis();
}
