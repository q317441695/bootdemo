package com.demo.service;

import com.demo.pojo.Demo;

public interface DemoService {

    int insert(Demo demo);

    Demo selectById(String id);
}
