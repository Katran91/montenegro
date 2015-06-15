package com.katran.dto;

/**
 * Created by astratii on 6/15/2015.
 */
public class WinnerDTO {
    private String student;
    private Integer studentInstitut;
    private String teacher;
    private Integer kafedra;

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

    public Integer getKafedra() {
        return kafedra;
    }

    public void setKafedra(Integer kafedra) {
        this.kafedra = kafedra;
    }
}
