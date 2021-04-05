package com.ma.dao;

import com.mf.dao.UserMapper;
import com.mf.pojo.User;
import com.mf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author mf
 * @create 2021-04-04-11:12
 */
public class MainTest {
    @Test
    public void testqueryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        System.out.println("==========================================");
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);
        sqlSession2.close();
    }
}
