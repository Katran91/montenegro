package com.katran.controllers;

import com.katran.dao.services.StudentService;
import com.katran.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by astratii on 3/27/2015.
 */
@Controller
@RequestMapping("/api/student")
public class StudentController {
    @Resource(name="studentService")
    private StudentService studentService;

    @RequestMapping(value = "/students")
    public @ResponseBody List<Student> getAllStudents(){
        List<Student> students = studentService.getAll();

        return students;
    }
}
