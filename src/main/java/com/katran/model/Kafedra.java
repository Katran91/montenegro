package com.katran.model;

import javax.persistence.*;

/**
 * Created by astratii on 4/7/2015.
 */
@Entity
@Table(name = "KAFEDRA")
public class Kafedra {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @ManyToOne
    @JoinColumn(name = "INSTITUTE_ID")
    private Institute institute;

    public Kafedra(String name, Institute institute) {
        this.name = name;
        this.institute = institute;
    }

    public Kafedra() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }
}

