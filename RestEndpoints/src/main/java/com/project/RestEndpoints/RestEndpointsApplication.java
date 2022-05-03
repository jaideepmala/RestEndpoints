package com.project.RestEndpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RestEndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestEndpointsApplication.class, args);
		System.out.println("Hello World!");
	}

}
