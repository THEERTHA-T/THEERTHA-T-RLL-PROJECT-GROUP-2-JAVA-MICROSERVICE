package com.questions;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient; // Import EnableEurekaClient
import com.questions.entities.PublicQuestion;
import com.questions.services.QuestionRepository;
//import com.questions.services.QuestionsRepository;

@EnableEurekaClient
@EnableDiscoveryClient

 // Add this annotation to enable Eureka client
@SpringBootApplication
public class IpmPublicQuestionsApplication implements CommandLineRunner {

   

    public static void main(String[] args) {
        SpringApplication.run(IpmPublicQuestionsApplication.class, args);
    }

    @Autowired
	@Qualifier("questionRepository")
	private QuestionRepository questionRepository;
    
    @Override
	public void run(String... args) throws Exception {
    	questionRepository.save(new PublicQuestion(1,"Manasa","madabushi@gmail.com","Hi, I have an accident"));
    	System.out.println(questionRepository.findAll());
//    	System.out.println(questionRepository.);
    	
        
    }
}
