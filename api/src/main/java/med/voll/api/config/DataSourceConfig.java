/*
package med.voll.api.config;

import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig extends AbstractRoutingDataSource {
    @Autowired
    private Environment env;

    @Override
    protected Object determineCurrentLookupKey() {
        return "default";
    }

    @Bean
    @Primary
    public DataSource dataSource() {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("default", buildDataSource());
        setTargetDataSources(targetDataSources);
        return this;
    }

    private DataSource buildDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(String.valueOf(env.getClass()));
        dataSource.setUsername(String.valueOf(env.getClass()));
        dataSource.setPassword(String.valueOf(env.getClass()));
        dataSource.setDriverClassName(String.valueOf(env.getClass()));
        return dataSource;
    }
}*/
