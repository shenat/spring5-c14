package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

//config server add
@EnableConfigServer
@ComponentScan(basePackages = {"com.sat"})
@SpringBootApplication
public class Spring5ConfigServerC14Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5ConfigServerC14Application.class, args);
	}

}
