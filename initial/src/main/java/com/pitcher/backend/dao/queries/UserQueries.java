package com.pitcher.backend.dao.queries;

import com.pitcher.backend.registry.REGISTRY;

/**
 * Created by user on 01/04/2018.
 */
public class UserQueries implements Queries {

    @Override
    public String getAll() {
        String query = ""+
                "SELECT * FROM " + REGISTRY.database+"user";

        return query;
    }

    @Override
    public String getById(Long id) {
        String query = ""+
                "SELECT * FROM " + REGISTRY.database+"user"+
                "WHERE id="+id;
        return  query;
    }

    @Override
    public String getByProperty(String propertyKey, String propertyValue) {
        String query = ""+
                "SELECT * FROM " + REGISTRY.database+propertyKey+
                "WHERE username="+propertyValue;
        return query;
    }

    @Override
    public String delete() {
        return null;
    }

    @Override
    public String update() {
        return null;
    }

    @Override
    public String create(String type, String... args) {
        return null;
    }
}
