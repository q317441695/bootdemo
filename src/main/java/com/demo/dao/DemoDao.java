package com.demo.dao;

import com.demo.pojo.Demo;

public interface DemoDao {

    int insert(Demo demo);

    Demo selectById(String id);
}
