package com.ipm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class IpmProjectPolicyServiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpmProjectPolicyServiceConfigServerApplication.class, args);
	}

}
