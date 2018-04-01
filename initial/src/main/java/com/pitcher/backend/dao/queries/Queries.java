package com.pitcher.backend.dao.queries;

/**
 * Created by user on 01/04/2018.
 */
public interface Queries {

    String getAll();

    String getById(Long id);

    String getByProperty(String propertyKey, String propertyValue);

    String delete();

    String update();

    String create(String type, String ...args);
}
