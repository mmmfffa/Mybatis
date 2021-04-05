package com.mf.dao;

import com.mf.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-02-21:36
 */
public interface TeacherMapper
{
    List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacherById(@Param("tid")int id);
    Teacher getTeacherById2(@Param("tid")int id);
}
