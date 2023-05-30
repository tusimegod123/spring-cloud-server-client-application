package com.springcloud.springcloudconfig.controller;

import com.springcloud.springcloudconfig.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private final DatabaseConfig databaseConfig;

    public AppController(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    @GetMapping("/database-url")
    public String getDatabaseUrl() {
        return databaseConfig.getDatabaseUrl();
    }

    @GetMapping("/database-username")
    public String getDatabaseName() {
        return databaseConfig.getDatabaseUsername();
    }
    @GetMapping("/database-password")
    public String getDatabasePassword() {
        return databaseConfig.getDatabasePassword();
    }

}
