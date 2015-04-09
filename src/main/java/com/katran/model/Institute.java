package com.katran.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by astratii on 4/7/2015.
 */
@Entity
@Table(name = "INSTITUTE")
public class Institute {

    @Id
    @Column(name = "INSTITUTE_ID")
    @GeneratedValue
    private Integer instituteId;
    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "institute")
    private Set<Kafedra> kafedras;

    public Institute(String name) {
        this.name = name;
    }

    public Institute() {
    }

    public Integer getId() {
        return instituteId;
    }

    public void setId(Integer instituteId) {
        this.instituteId = instituteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
