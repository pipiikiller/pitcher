package com.pitcher.backend.registry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by user on 01/04/2018.
 */
@Component
public class REGISTRY {

    @Value("${pitch_database}")
    private String pitchDatabase;

    public static String database;

    @PostConstruct
    public void init(){
        database=pitchDatabase;
    }

}
