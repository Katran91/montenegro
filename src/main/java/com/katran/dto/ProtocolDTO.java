package com.katran.dto;

import java.util.Date;

/**
 * Created by Katran on 14.06.2015.
 */
public class ProtocolDTO {
    private Date date;
    private String category;
    private String category_name;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
