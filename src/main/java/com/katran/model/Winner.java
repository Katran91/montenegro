package com.katran.model;

import javax.persistence.*;

/**
 * Created by Katran on 13.06.2015.
 */
@Entity
@Table(name = "WINNER")
public class Winner {
    @Id
    @Column(name = "WINNER_ID")
    @GeneratedValue
    private Integer winnerId;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "INSTITUTE_ID")
    private Institute institute;

    @Column(name = "TEACHER")
    private String teacher;

    @ManyToOne
    @JoinColumn(name = "KAFEDRA_ID")
    private Kafedra kafedra;

    @Column(name = "SCORE")
    private Integer score;

    @Column(name = "POSITION")
    private Integer position;

    @Column(name = "POSITION_MONU")
    private Integer positionMONU;

    public Integer getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Kafedra getKafedra() {
        return kafedra;
    }

    public void setKafedra(Kafedra kafedra) {
        this.kafedra = kafedra;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPositionMONU() {
        return positionMONU;
    }

    public void setPositionMONU(Integer positionMONU) {
        this.positionMONU = positionMONU;
    }
}
