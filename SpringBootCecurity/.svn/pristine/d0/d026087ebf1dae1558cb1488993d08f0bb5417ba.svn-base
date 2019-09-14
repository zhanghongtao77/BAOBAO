package com.xueqing.demo.springbootsecurity.controller;

import com.xueqing.demo.springbootsecurity.bean.Count;
import com.xueqing.demo.springbootsecurity.service.HighchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HighchartsController {
    @Autowired
    private HighchartsService highchartsService;

    @RequestMapping("queryDataBase")
    @ResponseBody
    public List getData(){
        List<Map<String,Object>> list = highchartsService.selectWorkloadAnalysis();
        return list;
    }

}
