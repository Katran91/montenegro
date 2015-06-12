package com.katran.controller;

import com.katran.dao.service.*;
import com.katran.model.Dysciplina;
import com.katran.model.Institute;
import com.katran.model.Kafedra;
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
    @Resource(name="dysciplinaService")
    private DysciplinaService dysciplinaService;
    @Resource(name="instituteService")
    private InstituteService instituteService;
    @Resource(name="kafedraService")
    private KafedraService kafedraService;
    @Resource(name="teacherService")
    private TeacherService teacherService;

    @RequestMapping(value = "/students/add")
    public void addStudent(@RequestParam(value = "name") String name,
                           @RequestParam(value = "date") Date date,
                           @RequestParam(value = "kurs") int kurs){
        Student student = new Student(name,name,name,date,kurs);
        //Student student = new Student("vasya","vasya1","vasya2",new Date(),1);
        studentService.add(student);
    }

    @RequestMapping(value = "/students")
    public @ResponseBody List<Student> getAllStudents(){
        return studentService.getAll();
    }

    @RequestMapping(value = "/init")
    public void initalizeData(){

        Student student = new Student("vasya","vasya1","vasya2",new Date(),1);
        studentService.add(student);
        student = new Student("vasya1","vasya11","vasya12",new Date(),1);
        studentService.add(student);
        student = new Student("vasya1","vasya11","vasya12",new Date(),1);
        studentService.add(student);

        dysciplinaService.add(new Dysciplina("Дисципліна"));
        dysciplinaService.add(new Dysciplina("Спеціальність"));

        Institute gmi = new Institute("ГМІ");
        instituteService.add(gmi);

        kafedraService.add(new Kafedra("Педагогіки та психології професійної освіти",gmi));
    }
}
