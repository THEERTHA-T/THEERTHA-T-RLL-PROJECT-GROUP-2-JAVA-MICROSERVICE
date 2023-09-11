package com.ipm.admin.reply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class IpmAdminReplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpmAdminReplyApplication.class, args);
	}

}
