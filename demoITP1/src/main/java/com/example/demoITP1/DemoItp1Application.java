package com.example.demoITP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class DemoItp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoItp1Application.class, args);
	}

}
