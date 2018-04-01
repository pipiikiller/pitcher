package com.pitcher.backend.dao.queries;

/**
 * Created by user on 01/04/2018.
 */
public class QueriesFactory {

    public static Queries getQueryClass(String type){

        Queries queries = null;

        switch (type){
            case "Pitch":
                queries = new PitchQueries();
                break;
            case "User":
                queries = new UserQueries();
                break;
        }
        return queries;
    }
}
