package com.mf.dao;


import com.mf.pojo.Student;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-02-21:36
 */
public interface StudentMapper
{
    //查询所有的学生信息以及对应的老师的信息！
    public List<Student> getStudent();
    public List<Student> getStudent2();
}