package com.ipm.api.customerQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ipm.api.customerQuery.entity.CustomerQuestions;
import com.ipm.api.customerQuery.repositories.CustomerQuestionsRepository;

@SpringBootApplication
@EnableEurekaClient
public class CustomerQueryApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CustomerQueryApplication.class, args);
    }

    @Autowired
    @Qualifier("customerQuestionsRepository")
    private CustomerQuestionsRepository customerQuestionsRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create and save sample customer questions here if needed
        customerQuestionsRepository.save(new CustomerQuestions(null, "customer1@example.com", "Question 1", "Details 1", TodysDate.todayDate(), "Answer 1",TodysDate.todayDate()));
        customerQuestionsRepository.save(new CustomerQuestions(null, "customer2@example.com", "Question 2", "Details 2", TodysDate.todayDate(), "Answer 2", TodysDate.todayDate()));
        // Add more sample data as needed
    }
}
