package com.mf.dao;

import com.mf.pojo.User;
import com.mf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sun.plugin2.main.server.Plugin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mf
 * @create 2021-04-01-15:13
 */
public class UserMapperTest {

    @Test
    public void testgetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);

        sqlSession.close();

    }

    @Test
    public  void testgetUserByNP(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByNP("张三", "22222");
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public  void testgetByNP_map(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username","张三");
        map.put("pwd","22222");
        User userByNP_map = mapper.getUserByNP_map(map);
        System.out.println(userByNP_map);

        sqlSession.close();
    }

    @Test
    public void  testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User(4,"阿里","zbbb");
        int i = mapper.addUser(user);
        System.out.println(i);
        sqlSession.commit();//重点，提交事务，不写的话不会提交到数据库
        //注意点：增删改操作需要提交事务！
        sqlSession.close();
    }

    @Test
    public void testupdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        userById.setPwd("jjjjkkkk");
        int i = mapper.updateUser(userById);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdeletUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(1);
        System.out.println(i);
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void  testselectLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectLike("%李%");//字符串通配符号
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
