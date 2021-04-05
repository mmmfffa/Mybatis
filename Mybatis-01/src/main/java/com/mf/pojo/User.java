package com.mf.pojo;

/**
 * @author mf
 * @create 2021-04-01-14:36
 * @TableName("tb_user")
 */
//实体类


public class User {
    private  int id;
    private  String username;
    private  String pwd;

    public User() {
    }

    public User(int id, String username, String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
