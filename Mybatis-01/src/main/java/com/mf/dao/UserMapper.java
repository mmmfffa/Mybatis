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
    //课堂练习：根据密码和名字查询用户
    //思路一：直接在方法中传递参数  在接口方法的参数前加@param属性,Sql语句编写的时候直接去@param中设置的参数,不许要单独设置参数类型
    User getUserByNP(@Param("username")String username,@Param("pwd")String pwd);
    //思路二：使用万能的Map sql语句编写的时候需要传递参数类型map
    User getUserByNP_map(Map<String,Object> map);

    //insert
    int addUser(User user);
    //修改一个用户
    int updateUser(User user);
    //根据id删除一个用户
    int deleteUser(int id);

    List<User> selectLike(String value);


}
