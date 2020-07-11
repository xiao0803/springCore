package com.example.tx.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.tx.inte.NewsDao;

public class NewsDaoImpl implements NewsDao {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert() {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        template.update("DELETE FROM users WHERE id_ = 10");
        template.update("INSERT INTO users (id_, userName_, userPassword_) VALUES(10, 'xlj1', '111');");
        //两次相同的操作，将违反主键约束
        //template.update("INSERT INTO users (id_, userName_, userPassword_) VALUES(10, 'xlj2', '222');");
    }
    
}
