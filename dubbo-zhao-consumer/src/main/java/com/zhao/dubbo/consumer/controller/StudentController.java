package com.zhao.dubbo.consumer.controller;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhao.dubbo.pojo.Student;
import com.zhao.dubbo.service.StudentService;
@RestController
public class StudentController {

    //与之前提供者提供的版本号对应
    @DubboReference(version = "1.0.0")
    private StudentService studentService;

    @GetMapping("/get")
    public Student findStudentById(int id){
       return studentService.findStudentById(id);
    }

}
