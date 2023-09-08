package com.ipm.api.customerQuery.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ipm.api.customerQuery.entity.CustomerQuestions;
import com.ipm.api.customerQuery.services.CustomerQuestionsService;

@RestController
//@CrossOrigin("http://localhost:4200")
@RequestMapping("/customerquestions")
public class CustomerQuestionsController {

    private final CustomerQuestionsService cqService;
   
    @Autowired
    public CustomerQuestionsController(CustomerQuestionsService cqService) {
        this.cqService = cqService;
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCustomerQuestions(@RequestBody CustomerQuestions cq) {
        cqService.saveCustomerQuestions(cq);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerQuestions> getAllCustomerQuestions() {
        return cqService.getAllCustomerQuestions();
    }

    @GetMapping(value = "/{qid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<CustomerQuestions> getCustomerQuestionsById(@PathVariable("qid") Long qid) {
        return cqService.getCustomerQuestionsById(qid);
    }

    
    @GetMapping("/customeremail/{email}")
    public List<CustomerQuestions> findCustomerQuestionsByEmail(@PathVariable("email") String email) {
        return cqService.findCustomerQuestionsByEmail(email);
    }

    @GetMapping("/count")
    public int countCustomerQuestions() {
        return cqService.countCustomerQuestions();
    }
    
}
