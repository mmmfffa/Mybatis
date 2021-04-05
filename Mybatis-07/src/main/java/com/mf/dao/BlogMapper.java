package com.mf.dao;

import com.mf.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author mf
 * @create 2021-04-03-20:37
 */
public interface BlogMapper {
    void addBlog(Blog blog);
    //动态查询博客
    List<Blog> queryBlogIF(Map<String,Object> map);

    List<Blog> queryBlogChoose(Map<String,Object> map);

    int updateBlog(Map<String,Object> map);
    //foreach查询1-2-3号博客
    List<Blog> queryBloForeach(Map<String,Object> map);




}
