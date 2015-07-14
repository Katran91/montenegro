package com.katran.model;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;

/**
 * Created by astratii on 7/14/2015.
 */
@Entity
@Table(name = "INT_STATISTIC")
public class IntStatistic {
    @Id
    @Column(name = "INT_STATISTIC_ID")
    @GeneratedValue
    private Integer intStatisticId;

    @ManyToOne
    @JoinColumn(name = "INSTITUTE_ID")
    private Institute institute;

    @Column(name = "STUDENT_COUNT")
    private String studentCount;

    @ManyToOne
    @JoinColumn(name = "PROTOCOL_ID")
    private Protocol protocol;

    public IntStatistic(Institute institute, String studentCount) {
        this.institute = institute;
        this.studentCount = studentCount;
    }

    public IntStatistic() {
    }

    public Integer getIntStatisticId() {
        return intStatisticId;
    }

    public void setIntStatisticId(Integer intStatisticId) {
        this.intStatisticId = intStatisticId;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public String getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(String studentCount) {
        this.studentCount = studentCount;
    }

    @JsonIgnore
    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
}
