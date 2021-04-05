package com.mf.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author mf
 * @create 2021-04-03-20:33
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致
    private int views;

}
