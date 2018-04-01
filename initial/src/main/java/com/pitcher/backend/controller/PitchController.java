package com.pitcher.backend.controller;

import com.pitcher.backend.handler.PitchHandler;
import com.pitcher.backend.model.Pitch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by user on 01/04/2018.
 */
@RestController
public class PitchController {

    @Autowired
    private PitchHandler pitchHandler;

    @RequestMapping("/pitches")
    public List<Pitch> getPitches(){

        return pitchHandler.getAllPitches();
    }

    @RequestMapping("/pitches/pitch")
    public Pitch getPitchesByName(@RequestParam String name){

        return pitchHandler.getPitch(name);
    }
}
