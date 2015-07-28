package com.katran.dto;

/**
 * Created by astratii on 6/15/2015.
 */
public class InstStatisticDTO {
    private Integer id;
    private Integer institute;
    private Integer studentCount;

    public InstStatisticDTO() {
    }

    public InstStatisticDTO(Integer id, Integer institut, Integer studentCount) {
        this.id = id;
        this.institute = institut;
        this.studentCount = studentCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstitute() {
        return institute;
    }

    public void setInstitute(Integer institute) {
        this.institute = institute;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }
}
