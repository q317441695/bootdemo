package com.demo.service.impl;

import com.demo.dao.DemoDao;
import com.demo.pojo.Demo;
import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public int insert(Demo demo) {
        return this.demoDao.insert(demo);
    }

    @Override
    public Demo selectById(String id) {
        return this.demoDao.selectById(id);
    }
}
