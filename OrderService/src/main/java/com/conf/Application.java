package com.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials;
import org.springframework.cloud.aws.context.config.annotation.EnableContextRegion;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan("com*")
@EnableContextCredentials(accessKey="${AWS_ACCESS}", secretKey="${AWS_KEY}")
@EnableContextRegion(autoDetect=true)
@EnableSqs
public class Application extends SpringBootServletInitializer{
	
	
	public static void main(String[] args){
		
		SpringApplication.run(Application.class, args);

	}
	
}