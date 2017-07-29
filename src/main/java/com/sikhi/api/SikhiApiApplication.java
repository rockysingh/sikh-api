package com.sikhi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SikhiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SikhiApiApplication.class, args);
	}
}
