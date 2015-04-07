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
    @Column(name = "INSTITUT")
    private Integer institut;

    public Kafedra(String name, Integer institut) {
        this.name = name;
        this.institut = institut;
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

    public Integer getInstitut() {
        return institut;
    }

    public void setInstitut(Integer institut) {
        this.institut = institut;
    }
}

