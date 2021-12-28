package com.zhao.dubbo.consumer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhao.dubbo.consumer.service.TestService;

@RestController
public class TestController {

	@Autowired
    private TestService testService;

    @GetMapping("/test")
    public String findStudentById(){
       return testService.zhaoTestService();
    }

}
