package com.katran.dto;

/**
 * Created by astratii on 7/14/2015.
 */
public class ComParticipantsDTO {
    private Integer id;
    private String name;

    public ComParticipantsDTO() {
    }

    public ComParticipantsDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
