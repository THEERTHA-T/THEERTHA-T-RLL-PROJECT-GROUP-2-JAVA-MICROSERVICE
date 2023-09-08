package com.ipm.api.customerQuery.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipm.api.customerQuery.entity.CustomerQuestions;
import com.ipm.api.customerQuery.repositories.CustomerQuestionsRepository;

@Service
public class CustomerQuestionsServiceImpl implements CustomerQuestionsService {

    private final CustomerQuestionsRepository cqRepository;
    

    @Autowired
    public CustomerQuestionsServiceImpl(CustomerQuestionsRepository cqRepository) {
        this.cqRepository = cqRepository;
    }

    @Override
    public void saveCustomerQuestions(CustomerQuestions cq) {
        cqRepository.save(cq);
    }

    @Override
    public List<CustomerQuestions> getAllCustomerQuestions() {
        return cqRepository.findAll();
    }

    @Override
    public Optional<CustomerQuestions> getCustomerQuestionsById(Long qid) {
        return cqRepository.findById(qid);
    }
   

    @Override
    public int countCustomerQuestions() {
        List<CustomerQuestions> allCq = cqRepository.findAll();
        return allCq.size();
    }


    @Override
    public List<CustomerQuestions> findCustomerQuestionsByEmail(String email) {
        return cqRepository.findByCustomeremail(email);
    }



}
