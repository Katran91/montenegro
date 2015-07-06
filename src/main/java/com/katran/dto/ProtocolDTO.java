package com.katran.dto;

import java.util.Date;
import java.util.Set;

/**
 * Created by Katran on 14.06.2015.
 */
public class ProtocolDTO {
    private Date date;
    private Integer category;
    private String category_name;
    private Integer kafedra;
    private Integer institut;
    private String com_head;
    private String com_participant;

    private InstStatisticDTO instStatistic;
    private Set<WinnerDTO> winners;

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

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
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

    public String getCom_head() {
        return com_head;
    }

    public void setCom_head(String com_head) {
        this.com_head = com_head;
    }

    public String getCom_participant() {
        return com_participant;
    }

    public void setCom_participant(String com_participant) {
        this.com_participant = com_participant;
    }

    public InstStatisticDTO getInstStatistic() {
        return instStatistic;
    }

    public void setInstStatistic(InstStatisticDTO instStatistic) {
        this.instStatistic = instStatistic;
    }

    public Set<WinnerDTO> getWinners() {
        return winners;
    }

    public void setWinners(Set<WinnerDTO> winners) {
        this.winners = winners;
    }
}
