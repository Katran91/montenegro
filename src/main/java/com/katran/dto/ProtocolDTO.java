package com.katran.dto;

import java.util.Date;

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
    private WinnerDTO winner1;
    private WinnerDTO winner2;
    private WinnerDTO winner3;

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

    public WinnerDTO getWinner1() {
        return winner1;
    }

    public void setWinner1(WinnerDTO winner1) {
        this.winner1 = winner1;
    }

    public WinnerDTO getWinner2() {
        return winner2;
    }

    public void setWinner2(WinnerDTO winner2) {
        this.winner2 = winner2;
    }

    public WinnerDTO getWinner3() {
        return winner3;
    }

    public void setWinner3(WinnerDTO winner3) {
        this.winner3 = winner3;
    }
}
