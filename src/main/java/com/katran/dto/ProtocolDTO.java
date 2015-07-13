package com.katran.dto;

import java.util.ArrayList;
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
    private ArrayList<String> com_participants;

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

    public ArrayList<String> getCom_participants() {
        return com_participants;
    }

    public void setCom_participants(ArrayList<String> com_participants) {
        this.com_participants = com_participants;
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
