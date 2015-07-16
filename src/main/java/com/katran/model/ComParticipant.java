package com.katran.model;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;

/**
 * Created by astratii on 7/14/2015.
 */
@Entity
@Table(name = "COM_PARTICIPANT")
public class ComParticipant {
    @Id
    @Column(name = "COM_PARTICIPANT_ID")
    @GeneratedValue
    private Integer comParticipantId;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "PROTOCOL_ID", insertable = false, updatable = false, nullable = false)
    private Protocol protocol;

    public ComParticipant() {
    }

    public ComParticipant(String name) {
        this.name = name;
    }

    public Integer getComParticipantId() {
        return comParticipantId;
    }

    public void setComParticipantId(Integer comParticipantId) {
        this.comParticipantId = comParticipantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
}
