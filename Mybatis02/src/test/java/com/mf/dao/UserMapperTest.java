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
    public void testgetUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
