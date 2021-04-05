package com.mf.dao;


import com.mf.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-01-14:42
 */
public interface UserMapper {

    @Select("select * from mybatis.tb_user")
    List<User> getUsers();

    @Select("select id,username,pwd as password from mybatis.tb_user where id=#{id}")
    User selectUserById(@Param("id")int id);

    @Insert("insert into mybatis.tb_user (id,username,pwd) values (#{id},#{username},#{password})")
    int addUser(User user);

    @Update("update mybatis.tb_user set username=#{username},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from mybatis.tb_user where id=#{id}")
    int deleteUserById(@Param("id")int id);

}
