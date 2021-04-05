package com.mf.dao;

import com.mf.pojo.User;
import com.mf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-01-15:13
 */
public class UserMapperTest {
   @Test
    public void testgetUsers(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       List<User> users = mapper.getUsers();
       for (User user : users) {
           System.out.println(users);
       }

       sqlSession.close();
   }
   @Test
    public void testselectUserById(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       User user = mapper.selectUserById(2);
       System.out.println(user);

       sqlSession.close();
   }
   @Test
    public void testaddUser(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      int res = mapper.addUser(new User(1, "魔法门", "22331"));
      System.out.println(res);
     // sqlSession.commit();

      sqlSession.close();
   }
   @Test
    public void testupdateUser(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       int res = mapper.updateUser(new User(1, "鸿鸿", "222244"));
       System.out.println(res);
       sqlSession.commit();

       sqlSession.close();
   }
   @Test
    public void testdeleteUserById(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       int i = mapper.deleteUserById(2);
       System.out.println(i);
       //sqlSession.commit();重载之后不用手动去提交
       sqlSession.close();
   }

}
