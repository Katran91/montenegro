package com.katran.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Katran on 13.06.2015.
 */
@Entity
@Table(name = "PROTOCOL")
public class Protocol {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "NUMBER")
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "DYSCIPLINA_ID")
    private Dysciplina dysciplina;

    @Column(name = "DYSCIPLINA_NAME")
    private String dysciplina_name;

    @Column(name = "DATE")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "KAFEDRA_ID")
    private Kafedra kafedra;

    @ManyToOne
    @JoinColumn(name = "INSTITUTE_ID")
    private Institute institute;

    @ManyToOne
    @JoinColumn(name = "WINNER_ID")
    private Winner winner;


    public Protocol() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Dysciplina getDysciplina() {
        return dysciplina;
    }

    public void setDysciplina(Dysciplina dysciplina) {
        this.dysciplina = dysciplina;
    }

    public String getDysciplina_name() {
        return dysciplina_name;
    }

    public void setDysciplina_name(String dysciplina_name) {
        this.dysciplina_name = dysciplina_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Kafedra getKafedra() {
        return kafedra;
    }

    public void setKafedra(Kafedra kafedra) {
        this.kafedra = kafedra;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }
}
