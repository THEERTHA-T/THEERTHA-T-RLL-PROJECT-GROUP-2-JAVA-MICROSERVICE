package com.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer

@SpringBootApplication
public class IpmPublicQuestionsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpmPublicQuestionsEurekaServerApplication.class, args);
	}

}
