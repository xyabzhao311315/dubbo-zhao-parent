package com.zhao.dubbo.provider.service.impl;
import org.apache.dubbo.config.annotation.DubboService;

import com.zhao.dubbo.pojo.Student;
import com.zhao.dubbo.service.StudentService;

//规定版本号version，这个是实现一个一个提供者多个实现
//interfaceClass，引用远程接口服务通过放射引用
@DubboService(version = "1.0.0",interfaceClass = StudentService.class)
public class StudentServiceImpl implements StudentService {
    @Override
    public Student findStudentById(int id) {
        Student student = new Student();
        student.setId(id);
        student.setName("小夏");
        student.setClassName("一班");
        return student;
    }
}
