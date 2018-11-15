package com.demo.controller;

import com.demo.pojo.Demo;
import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/showDemo/{id}")
    @ResponseBody
    public Demo toIndex(@PathVariable String id){
        return this.demoService.selectById(id);
    }

    @RequestMapping("/save")
    @ResponseBody
    public String toIndex(Demo demo){
        int count = this.demoService.insert(demo);
        if(count > 0){
            return "true";
        }else {
            return "false";
        }
    }
}
