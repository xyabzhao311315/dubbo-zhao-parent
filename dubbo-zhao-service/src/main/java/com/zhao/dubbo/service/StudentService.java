package com.zhao.dubbo.service;
import com.zhao.dubbo.pojo.Student;

public interface StudentService {

    //根据学生id查询学生信息
    public Student findStudentById(int id);

}
