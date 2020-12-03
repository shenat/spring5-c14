package com.sat.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.sat")
@SpringBootApplication
public class Spring5ConfigClientC14Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5ConfigClientC14Application.class, args);
	}

}
