package com.demo.sendgrid;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendGridDemoApplication {

	public static Logger log = LoggerFactory.getLogger(SendGridDemoApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application Started..........");
	}

	public static void main(String[] args) {
		log.info("Application executed  	..........");
		SpringApplication.run(SendGridDemoApplication.class, args);
	}

}
