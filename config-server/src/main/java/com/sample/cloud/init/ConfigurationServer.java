package com.sample.cloud.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@EnableConfigServer 
@ComponentScan
@Configuration
public class ConfigurationServer {
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigurationServer.class, args);
    }
}
