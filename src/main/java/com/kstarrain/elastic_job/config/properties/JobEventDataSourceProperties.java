package com.kstarrain.elastic_job.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.elasticjob.event.datasource")
public class JobEventDataSourceProperties {

	private String driver;

	private String url;

    private String username;

    private String password;

}
