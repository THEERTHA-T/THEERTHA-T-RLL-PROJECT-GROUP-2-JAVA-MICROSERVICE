package com.ipm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ipm.entity.Policy;
import com.ipm.repository.PolicyRepository;

@EnableEurekaClient
@SpringBootApplication
public class IpmProjectPolicyServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IpmProjectPolicyServiceApplication.class, args);
    }

    @Autowired
    @Qualifier("policyRepository")
    private PolicyRepository policyRepository;

    @Override
    public void run(String... args) throws Exception {
        policyRepository.save(new Policy(null, "policy1", "Life Insurance", TodaysDate.todayDate()));
        policyRepository.save(new Policy(null, "policy2", "Travel Insurance", TodaysDate.todayDate()));
        policyRepository.save(new Policy(null, "policy3", "Health Insurance", TodaysDate.todayDate()));
        policyRepository.save(new Policy(null, "policy4", "Life Insurance", TodaysDate.todayDate()));
        policyRepository.save(new Policy(null, "policy5", "Health Insurance", TodaysDate.todayDate()));

    
    }
}
