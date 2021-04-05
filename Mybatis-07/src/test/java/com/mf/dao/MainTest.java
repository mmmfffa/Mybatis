package com.mf.dao;

import com.mf.pojo.Blog;
import com.mf.utils.IDUtils;
import com.mf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author mf
 * @create 2021-04-03-21:19
 */
public class MainTest {
    @Test
    public void addInitBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog=new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis好简单！");
        blog.setAuthor("马富说");
        blog.setCreateTime(new Date());
        blog.setViews(99999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring也简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java也简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务必须简单！");
        mapper.addBlog(blog);

        sqlSession.close();
    }
    @Test
    public void testqueryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map=new HashMap<>();
//       map.put("title","Spring也简单");//可以按照不同的属性进行搜索
        map.put("author","马富说2");//可以按照不同的属性进行搜索
       // map.put("id","dafa42c8da02478fab28e37f568f24c0");
        List<Blog> blogList = mapper.queryBlogIF(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }


        sqlSession.close();


    }
    @Test
    public void testqueryBloForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<>();

        ArrayList<Integer> ids = new ArrayList<>();
        map.put("ids",ids);
        ids.add(1);
        ids.add(3);
        List<Blog> blogList = mapper.queryBloForeach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }


        sqlSession.close();
    }



}
