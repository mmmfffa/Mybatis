package com.mf.pojo;

import lombok.Data;

/**
 * @author mf
 * @create 2021-04-02-21:33
 */
@Data
public class Student {

    private int id;
    private String username;
    //学生需要关联一个老师
    /*private int tid;*/
    private Teacher teacher;
}
