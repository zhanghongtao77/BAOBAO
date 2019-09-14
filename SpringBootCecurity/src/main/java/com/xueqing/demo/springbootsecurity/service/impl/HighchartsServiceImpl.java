package com.xueqing.demo.springbootsecurity.service.impl;

import com.xueqing.demo.springbootsecurity.mapper.HighchartsMapper;
import com.xueqing.demo.springbootsecurity.service.HighchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HighchartsServiceImpl implements HighchartsService {

    @Autowired
    private HighchartsMapper highchartsMapper;




    @Override
    public List<Map<String, Object>> selectWorkloadAnalysis() {
        return highchartsMapper.selectWorkloadAnalysis();
    }
}
