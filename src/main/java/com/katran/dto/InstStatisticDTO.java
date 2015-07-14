package com.katran.dto;

/**
 * Created by astratii on 6/15/2015.
 */
public class InstStatisticDTO {
    private Integer id;
    private Integer institut;
    private Integer studentCount;

    public InstStatisticDTO() {
    }

    public InstStatisticDTO(Integer id, Integer institut, Integer studentCount) {
        this.id = id;
        this.institut = institut;
        this.studentCount = studentCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstitut() {
        return institut;
    }

    public void setInstitut(Integer institut) {
        this.institut = institut;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }
}
