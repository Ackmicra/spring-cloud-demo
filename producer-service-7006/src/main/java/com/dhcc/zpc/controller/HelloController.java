package com.dhcc.zpc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* Hello控制器
*/
@RestController
public class HelloController {

    /**
     * 提供输出hello信息
     *
     * @param name 名字
     * @return "hello @name,this is producer service message!"
     */
    @RequestMapping("hello")
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }
}