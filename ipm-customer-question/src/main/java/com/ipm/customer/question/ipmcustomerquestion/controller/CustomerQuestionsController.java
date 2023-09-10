package com.ipm.customer.question.ipmcustomerquestion.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ipm.customer.question.ipmcustomerquestion.entity.CustomerQuestions;
import com.ipm.customer.question.ipmcustomerquestion.services.CustomerQuestionsService;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class CustomerQuestionsController {

	@Autowired(required=true)
    private CustomerQuestionsService customerQuestionsService;
   

    @PostMapping(value = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCustomerQuestions(@RequestBody CustomerQuestions cq) {
    	log.info("before save {}",cq);
    	customerQuestionsService.saveCustomerQuestions(cq);
    	log.info("after save {}",cq);
    }

    @GetMapping(value = "/all")
    public List<CustomerQuestions> getAllCustomerQuestions() {
        return customerQuestionsService.getAllCustomerQuestions();
    }

    @GetMapping(value = "/{qid}")
    public Optional<CustomerQuestions> getCustomerQuestionsById(@PathVariable("qid") Long qid) {
        return customerQuestionsService.getCustomerQuestionsById(qid);
    }

    
    @GetMapping("/customeremail/{email}")
    public List<CustomerQuestions> findCustomerQuestionsByEmail(@PathVariable("email") String email) {
        return customerQuestionsService.findCustomerQuestionsByEmail(email);
    }

    @GetMapping("/count")
    public int countCustomerQuestions() {
        return customerQuestionsService.countCustomerQuestions();
    }
    
}
