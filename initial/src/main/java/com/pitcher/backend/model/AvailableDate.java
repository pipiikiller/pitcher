package com.pitcher.backend.model;

import java.util.Date;

/**
 * Created by user on 01/04/2018.
 */
public class AvailableDate {

    private String id;
    private Date date;
    private Long pitchId;

    public AvailableDate(String id, Date date, Long pitchId) {
        this.id = id;
        this.date = date;
        this.pitchId = pitchId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getPitchId() {
        return pitchId;
    }

    public void setPitchId(Long pitchId) {
        this.pitchId = pitchId;
    }
}
