package com.katran.dto;

/**
 * Created by astratii on 6/15/2015.
 */
public class WinnerDTO {
    private Integer id;
    private String student;
    private Integer studentInstitut;
    private String teacher;
    private Integer teacherKafedra;

    public WinnerDTO() {
    }

    public WinnerDTO(Integer id, String student, Integer studentInstitut, String teacher, Integer teacherKafedra) {
        this.id = id;
        this.student = student;
        this.studentInstitut = studentInstitut;
        this.teacher = teacher;
        this.teacherKafedra = teacherKafedra;
    }

    public WinnerDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Integer getStudentInstitut() {
        return studentInstitut;
    }

    public void setStudentInstitut(Integer studentInstitut) {
        this.studentInstitut = studentInstitut;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getTeacherKafedra() {
        return teacherKafedra;
    }

    public void setTeacherKafedra(Integer teacherKafedra) {
        this.teacherKafedra = teacherKafedra;
    }
}
