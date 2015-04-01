package com.katran.controllers;

import com.katran.dao.services.StudentService;
import com.katran.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by astratii on 3/27/2015.
 */
@Controller
@RequestMapping("/api")
public class StudentController {
    @Resource(name="studentService")
    private StudentService studentService;

    @RequestMapping(value = "/students/add")
    public void addStudent(@RequestParam(value = "name") String name,
                           @RequestParam(value = "date") Date date,
                           @RequestParam(value = "kurs") int kurs){
        //Student student = new Student(name,name,name,date,kurs);
        Student student = new Student("vasya","vasya1","vasya2",new Date(),1);
        studentService.add(student);
    }

    @RequestMapping(value = "/students")
    public @ResponseBody List<Student> getAllStudents(){
        return studentService.getAll();
    }
}
