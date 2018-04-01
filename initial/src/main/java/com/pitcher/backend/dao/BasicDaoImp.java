package com.pitcher.backend.dao;

import com.pitcher.backend.dao.queries.Queries;
import com.pitcher.backend.dao.queries.QueriesFactory;
import com.pitcher.backend.dao.queries.pitch.PitchDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 01/04/2018.
 */
@Component
public abstract class BasicDaoImp<T> implements BasicDao<T> {

    private Logger LOGGER = LoggerFactory.getLogger(PitchDao.class.getName());
    private DataSource dataSource;

    private NamedParameterJdbcTemplate jdbc;

    private Class<T> type;

    @Autowired
    @Qualifier(value = "datasource")
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public BasicDaoImp() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        this.type = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public List<T> getAll() {

        Queries queries = QueriesFactory.getQueryClass(
                type.getTypeName().
                        substring(type.getTypeName().lastIndexOf(".")+1)
        );

        Map namedParameter = new HashMap();
        List<T> data = jdbc.query(queries.getAll()
                ,namedParameter,new BeanPropertyRowMapper<>(type));

        for(T t: data){
            LOGGER.info(t.toString());
        }

        return data;
    }

    @Override
    public T find(T t, String property) {
        Queries queries = QueriesFactory.getQueryClass(
                type.getTypeName().
                        substring(type.getTypeName().lastIndexOf(".")+1)
        );
        Field field = null;
        try {
            field = t.getClass().getDeclaredField(property);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        Map namedParameter = new HashMap();

        T data = jdbc.queryForObject(queries.getByProperty("name",field.getName())
                , (SqlParameterSource) namedParameter,new BeanPropertyRowMapper<>(type));

        return data;
    }

    @Override
    public T create(T t) {
        return null;
    }

    @Override
    public T update(T T) {
        return null;
    }

    @Override
    public void delete(T t) {

    }
}
