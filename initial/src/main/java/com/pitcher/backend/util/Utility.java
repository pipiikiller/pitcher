package com.pitcher.backend.util;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by user on 01/04/2018.
 */
public class Utility {

    public static DriverManagerDataSource getDataSource(String driverClassName,
                                                        String url, String username, String password) {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);



        return ds;

    }
}
