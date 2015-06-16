package com.katran.dto;

import com.katran.model.Dysciplina;
import com.katran.model.Institute;
import com.katran.model.Kafedra;
import com.katran.model.Winner;

/**
 * Created by astratii on 6/16/2015.
 */
public class StatisticDTO {
    private Integer winnerId;
    private Integer protocolId;
    private Institute institute;
    private Kafedra kafedra;
    private String dysciplina_name;
    private Dysciplina dysciplina;
    private String student_name;
    private Institute student_institute;
    private String teacher;
    private Kafedra teacher_kafedra;
    private Integer score;
    private Integer position;
    private Integer positionMONU;

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Kafedra getKafedra() {
        return kafedra;
    }

    public void setKafedra(Kafedra kafedra) {
        this.kafedra = kafedra;
    }

    public String getDysciplina_name() {
        return dysciplina_name;
    }

    public void setDysciplina_name(String dysciplina_name) {
        this.dysciplina_name = dysciplina_name;
    }

    public Dysciplina getDysciplina() {
        return dysciplina;
    }

    public void setDysciplina(Dysciplina dysciplina) {
        this.dysciplina = dysciplina;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Institute getStudent_institute() {
        return student_institute;
    }

    public void setStudent_institute(Institute student_institute) {
        this.student_institute = student_institute;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Kafedra getTeacher_kafedra() {
        return teacher_kafedra;
    }

    public void setTeacher_kafedra(Kafedra teacher_kafedra) {
        this.teacher_kafedra = teacher_kafedra;
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

    public Integer getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    public Integer getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

    public StatisticDTO(Integer winnerId, Integer protocolId, Institute institute, Kafedra kafedra, String dysciplina_name, Dysciplina dysciplina, String student_name, Institute student_institute, String teacher, Kafedra teacher_kafedra, Integer score, Integer position, Integer positionMONU) {
        this.winnerId = winnerId;
        this.protocolId = protocolId;
        this.institute = institute;
        this.kafedra = kafedra;
        this.dysciplina_name = dysciplina_name;
        this.dysciplina = dysciplina;
        this.student_name = student_name;
        this.student_institute = student_institute;
        this.teacher = teacher;
        this.teacher_kafedra = teacher_kafedra;
        this.score = score;
        this.position = position;
        this.positionMONU = positionMONU;
    }
}
