package com.dhcc.zpc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试控制类
 * @Author 赵朋超
 * @Date 2020/3/29 14:21
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /*
     * 熔断方法（failBack）必须和本方法（login）参数相等 ，否则调用直接报错
     * 当本方法（login）高并发，忙，或者报错的时候，熔断方法（failBack）才会被默认调用
     */
    @HystrixCommand(fallbackMethod = "failBack")
    @GetMapping("/login")
    String login(String userName, String passWord){
//        int k = 1/0;
        return "login Success!  用户名：" + userName + "   密码：" + passWord;
    }

    String failBack(String userName, String passWord){
        return "server is busy!  用户名：" + userName + "   密码：" + passWord;
    }
}
