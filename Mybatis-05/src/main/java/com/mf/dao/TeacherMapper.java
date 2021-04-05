package com.mf.dao;

import com.mf.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author mf
 * @create 2021-04-02-21:36
 */
public interface TeacherMapper
{
    @Select("select * from mybatis.tb_teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
