package com.katran.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 * Created by Katran on 14.06.2015.
 */
public class ProtocolDTO {
    private Integer id;
    private Date date;
    private Integer category;
    private String categoryName;
    private Integer kafedra;
    private Integer institut;
    private String comHead;
    private Set<ComParticipantsDTO> comParticipants;
    private Set<InstStatisticDTO> instStatistic;
    private Set<WinnerDTO> winners;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getKafedra() {
        return kafedra;
    }

    public void setKafedra(Integer kafedra) {
        this.kafedra = kafedra;
    }

    public Integer getInstitut() {
        return institut;
    }

    public void setInstitut(Integer institut) {
        this.institut = institut;
    }

    public String getComHead() {
        return comHead;
    }

    public void setComHead(String comHead) {
        this.comHead = comHead;
    }

    public Set<ComParticipantsDTO> getComParticipants() {
        return comParticipants;
    }

    public void setComParticipants(Set<ComParticipantsDTO> comParticipants) {
        this.comParticipants = comParticipants;
    }

    public Set<InstStatisticDTO> getInstStatistic() {
        return instStatistic;
    }

    public void setInstStatistic(Set<InstStatisticDTO> instStatistic) {
        this.instStatistic = instStatistic;
    }

    public Set<WinnerDTO> getWinners() {
        return winners;
    }

    public void setWinners(Set<WinnerDTO> winners) {
        this.winners = winners;
    }
}
