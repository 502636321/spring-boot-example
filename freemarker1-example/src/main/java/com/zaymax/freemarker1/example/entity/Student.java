package com.zaymax.freemarker1.example.entity;

import java.io.Serializable;

/**
 * 学生类
 */
public class Student implements Serializable {

    /**
     * 姓名
     */
    private String name;

    /**
     * 家庭住址
     */
    private String address;

    /**
     * 性别
     * 男 = 1
     * 女 = 0
     */
    private int gender;

}
