package com.katran.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Katran on 13.06.2015.
 */
@Entity
@Table(name = "PROTOCOL")
public class Protocol {
    @Id
    @Column(name = "PROTOCOL_ID")
    @GeneratedValue
    private Integer protocol_id;

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

    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL,mappedBy = "protocol")
    private Set<Winner> winners = new HashSet<Winner>();


    public Protocol() {
    }

    public Integer getProtocol_id() {
        return protocol_id;
    }

    public void setProtocol_id(Integer protocol_id) {
        this.protocol_id = protocol_id;
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

    public Set<Winner> getWinners() {
        return winners;
    }

    public void setWinners(Set<Winner> winners) {
        this.winners = winners;
    }
}
