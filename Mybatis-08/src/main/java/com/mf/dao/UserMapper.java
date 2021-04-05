package com.mf.dao;

import com.mf.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author mf
 * @create 2021-04-04-11:06
 */
public interface UserMapper {
    User queryUserById(@Param("id") int id);
    int updateUser(User user);
}
