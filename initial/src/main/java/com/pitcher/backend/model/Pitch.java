package com.pitcher.backend.model;

import java.util.List;

/**
 * Created by user on 01/04/2018.
 */
public class Pitch {

    private Long id;
    private String name;
    private List<AvailableDate> availableDates;

    //to instantiate row mapper
    public Pitch(){}

    public Pitch(String name, Long id, List<AvailableDate> availableDates) {
        this.name = name;
        this.id = id;
        this.availableDates = availableDates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AvailableDate> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<AvailableDate> availableDates) {
        this.availableDates = availableDates;
    }

    @Override
    public String toString() {
        return "Pitch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", availableDates=" + availableDates +
                '}';
    }
}
