package com.pitcher.backend.dao.queries;

import com.pitcher.backend.registry.REGISTRY;

/**
 * Created by user on 01/04/2018.
 */
public class PitchQueries implements Queries {

    @Override
    public String getAll() {
        String query = "" +
                "SELECT * FROM " + REGISTRY.database + "pitch";

        return query;
    }

    @Override
    public String create(String type, String ... args) {
        String query = "" +
                "INSERT INTO "+ REGISTRY.database+type
                +"(" +args[0]+","+ args[1]+")" +
                "VALUES (" + args[0] + "," + args[1] + ")";

        return query;
    }

    @Override
    public String getById(Long id) {

        String query = "" +
                "SELECT * FROM " +
                REGISTRY.database + "pitch " +
                "WHERE id=" + id;

        return query;
    }

    @Override
    public String getByProperty(String propertyKey, String propertyValue) {
        return null;
    }

    @Override
    public String delete() {
        return null;
    }

    @Override
    public String update() {
        return null;
    }
}
