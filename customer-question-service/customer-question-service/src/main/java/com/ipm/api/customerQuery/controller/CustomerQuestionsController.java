package com.ipm.api.customerQuery.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.ipm.api.customerQuery.entity.CustomerQuestions;
import com.ipm.api.customerQuery.services.CustomerQuestionsService;
import com.ipm.api.customerQuery.services.CustomerQuestionsServiceImpl;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/{qid}")
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomerQuestions(@PathVariable("qid") Long qid, @RequestBody CustomerQuestions cq) {
        cqService.updateCustomerQuestions(qid, cq);
    }

    @DeleteMapping("/{qid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerQuestionsById(@PathVariable("qid") Long qid) {
        cqService.deleteCustomerQuestionsById(qid);
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
