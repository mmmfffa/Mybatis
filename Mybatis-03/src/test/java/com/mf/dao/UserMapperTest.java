package com.mf.dao;

import com.mf.pojo.User;
import com.mf.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

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
        User userById = mapper.getUserById(2);
        System.out.println(userById);

        /*  解决字段名和实体属性名不一样的问题：
          方法一：起别名
          类型选择器：
          select * from mybatis.tb_user where id=#{id}
          select id,username,pwd from mybatis.tb_user where id=#{id}
          select id,username,pwd as password from mybatis.tb_user where id=#{id}
          方法二：resultMap 结果集映射

        */
        sqlSession.close();
    }
    //注意导的包是 import org.apache.log4j.Logger;
    static Logger logger=Logger.getLogger(UserMapperTest.class);
    @Test
    public void testselectUser(){
        logger.info("info:进入selectUser方法");
        logger.debug("debug:进入selectUser方法");
        logger.error("error:进入selectUser方法");
    }

    @Test
    public void testgetUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
     //   int currentPage=0;
        //int pageSize=2;
        Map<String,Object> map=new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testgetUserByLimitRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1, 2);


        //通过java代码实现分页
        List<User> userList = sqlSession.selectList("com.mf.dao.UserMapper.getUserByLimitRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
