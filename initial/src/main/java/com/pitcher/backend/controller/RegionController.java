package com.pitcher.backend.controller;

import com.pitcher.backend.model.Pitch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by user on 01/04/2018.
 */
@RestController
public class RegionController {

    @RequestMapping (value = "/pitches/{name}")
    public List<Pitch> getPitchesByRegion(){

        return null;
    }
}
