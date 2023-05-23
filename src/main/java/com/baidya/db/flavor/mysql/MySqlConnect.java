package com.baidya.db.flavor.mysql;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mysql")
@ConfigurationProperties(prefix = "spring.mysql.db")
@Getter
@Setter
public class MySqlConnect {
    private String url;
    private String username;
    private String password;
    private String driver;
}
