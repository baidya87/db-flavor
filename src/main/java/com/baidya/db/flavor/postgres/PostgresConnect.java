package com.baidya.db.flavor.postgres;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.postgres.db")
public class PostgresConnect {
    private String url;
    private String username;
    private String password;
    private String driver;

}
