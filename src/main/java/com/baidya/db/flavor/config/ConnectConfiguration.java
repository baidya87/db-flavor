package com.baidya.db.flavor.config;

import com.baidya.db.flavor.mysql.MySqlConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ConnectConfiguration {
    @Bean
    @Profile("mysql")
    @Autowired
    public DataSource mySqlDataSource(MySqlConnect mySqlConnect){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(mySqlConnect.getUrl());
        driverManagerDataSource.setUsername(mySqlConnect.getUsername());
        driverManagerDataSource.setPassword(mySqlConnect.getPassword());
        driverManagerDataSource.setDriverClassName(mySqlConnect.getDriver());
        return driverManagerDataSource;
    }
}
