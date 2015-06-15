package com.katran.model;

import javax.persistence.*;

/**
 * Created by astratii on 4/7/2015.
 */
@Entity
@Table(name = "DYSCIPLINA")
public class Dysciplina {

    @Id
    @Column(name = "DYSCIPLINA_ID")
    private Integer dysciplinaId;
    @Column(name = "NAME")
    private String name;

    public Dysciplina(Integer id, String name) {
        this.dysciplinaId = id;
        this.name = name;
    }

    public Dysciplina() {
    }

    public Integer getId() {
        return dysciplinaId;
    }

    public void setId(Integer id) {
        this.dysciplinaId = dysciplinaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
