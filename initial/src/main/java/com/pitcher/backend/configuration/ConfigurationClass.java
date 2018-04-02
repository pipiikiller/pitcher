package com.pitcher.backend.configuration;

import com.pitcher.backend.Main;
import com.pitcher.backend.util.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by user on 01/04/2018.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = Main.class)
public class ConfigurationClass {

    private Logger logger = LoggerFactory.getLogger(ConfigurationClass.class.getName());

    @Bean(name = "datasource")
    public DriverManagerDataSource getDataSource(
            @Value("${driverClassName}") String driverClassName,
            @Value("${db.url}") String dbUrl,
            @Value("${db.username}") String username,
            @Value("${db.password}") String password){
       return Utility.getDataSource(driverClassName,dbUrl,username,password);
    }
}
