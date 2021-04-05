package com.mf.dao;

import com.mf.pojo.Teacher;
import com.mf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-03-11:53
 */
public class MainTest {

    @Test
    public void testgetTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeacher();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void testgetTeacherBtId2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherBtId = mapper.getTeacherById2(1);
        System.out.println(teacherBtId);
        sqlSession.close();
    }
}
