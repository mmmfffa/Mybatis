package com.mf.dao;

import com.mf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.List;
import java.util.Map;

/**
 * @author mf
 * @create 2021-04-01-14:42
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //insert
    int addUser(User user);
    //修改一个用户
    int updateUser(User user);
    //根据id删除一个用户
    int deleteUser(int id);


}
