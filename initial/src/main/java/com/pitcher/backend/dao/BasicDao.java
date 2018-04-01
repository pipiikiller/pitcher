package com.pitcher.backend.dao;

import com.pitcher.backend.model.Pitch;

import java.util.List;

/**
 * Created by user on 01/04/2018.
 */
public interface BasicDao <T>{

    T create(T t);

    T find(T t, String property);

    T update(T T);

    void delete(T t);

    List<T> getAll();

}
