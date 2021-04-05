package com.mf.dao;

import com.mf.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author mf
 * @create 2021-04-01-14:42
 */
public interface UserMapper {

    User getUserById(int id);
    //分页1
    List<User> getUserByLimit(Map<String,Object> map);
    //分页2：老方法
    List<User> getUserByLimitRowBounds();

}
