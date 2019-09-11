package com.digital.office;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DatasourceConfig {
	@Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
          .driverClassName("com.mysql.cj.jdbc.Driver")
          .url("jdbc:mysql://localhost:3306/digital_office")
          .username("digital_office")
          .password("digital")
          .build(); 
    }
}
