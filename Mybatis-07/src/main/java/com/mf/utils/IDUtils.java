package com.mf.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author mf
 * @create 2021-04-03-20:41
 */
/* @SuppressWarnings("all")抑制警告 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
    }


}
