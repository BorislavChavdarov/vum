package com.example.vum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VumApplication {

	public static void main(String[] args) {
		SpringApplication.run(VumApplication.class, args);
	}

}
