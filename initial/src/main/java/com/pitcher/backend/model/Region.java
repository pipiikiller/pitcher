package com.pitcher.backend.model;

import java.util.List;

/**
 * Created by user on 01/04/2018.
 */
public class Region {

    private Long id;
    private String name;
    private List<Pitch> pitches;

    public Region(Long id, String name, List<Pitch> pitches) {
        this.id = id;
        this.name = name;
        this.pitches = pitches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pitch> getPitches() {
        return pitches;
    }

    public void setPitches(List<Pitch> pitches) {
        this.pitches = pitches;
    }
}
