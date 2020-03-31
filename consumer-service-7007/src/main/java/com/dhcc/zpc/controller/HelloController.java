package com.dhcc.zpc.controller;

import com.dhcc.zpc.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* Hello控制器
*/
@RestController
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;  // 远程调用接口

    @Autowired
    public HelloController(HelloRemote helloRemote) {
        this.helloRemote = helloRemote;
    }

    /**
     * 输出hello方法
     * @param name 名称
     * @return 远程调用返回值
     */
    @RequestMapping("hello")
    public String hello(@RequestParam String name){
        return helloRemote.hello(name);
    }
}