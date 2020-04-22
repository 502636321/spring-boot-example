package com.zaymax.freemarker1.example.controller;

import com.zaymax.freemarker1.example.entity.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生访问控制器
 */
@Controller
@RequestMapping(value = {"student"})
public class StudentController {
    protected final Log logger = LogFactory.getLog(StudentController.class);

    /**
     * 暂时不使用数据库,采用集合模拟,等后期慢慢完善教程再补充
     * 学生集合
     */
    public static final List<Student> STUDENTS = new ArrayList<>();

    /**
     * 学生信息访问主页
     * @return
     */
    @RequestMapping(value = {"index"})
    public String index(
            @RequestParam(required = false, defaultValue = "1") int page,  //学生分页 页码
            @RequestParam(required = false, defaultValue = "10") int size, //学生分页 单页数量
            Model model
    ) {
        int startIndex = (page - 1) * size; //学生集合开始索引
        int endIndex = page * size; //学生集合结束索引
        List<Student> students =
//        model.addAttribute("students", )
        return "student/index";
    }
}
