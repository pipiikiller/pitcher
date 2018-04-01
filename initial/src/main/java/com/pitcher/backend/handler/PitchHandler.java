package com.pitcher.backend.handler;

import com.pitcher.backend.dao.BasicDao;
import com.pitcher.backend.dao.queries.pitch.PitchDao;
import com.pitcher.backend.model.Pitch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 01/04/2018.
 */
@Service
public class PitchHandler {

    @Autowired
    private PitchDao pitchDao;

    public List<Pitch> getAllPitches(){

        return pitchDao.getAll();
    }

    public Pitch getPitch(String name) {

        return pitchDao.find("name", name);
    }
}
