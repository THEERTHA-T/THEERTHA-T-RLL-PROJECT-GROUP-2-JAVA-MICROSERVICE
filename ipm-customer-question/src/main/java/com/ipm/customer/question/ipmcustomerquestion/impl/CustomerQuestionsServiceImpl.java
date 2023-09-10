package com.ipm.customer.question.ipmcustomerquestion.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipm.customer.question.ipmcustomerquestion.TodysDate;
import com.ipm.customer.question.ipmcustomerquestion.entity.CustomerQuestions;
import com.ipm.customer.question.ipmcustomerquestion.repositories.CustomerQuestionsRepository;
import com.ipm.customer.question.ipmcustomerquestion.services.CustomerQuestionsService;

@Service
public class CustomerQuestionsServiceImpl implements CustomerQuestionsService {

	@Autowired
    private  CustomerQuestionsRepository customerQuestionsRepository;
    

   
    @Override
    public void saveCustomerQuestions(CustomerQuestions cq) {
    	cq.setQdate(TodysDate.todayDate());
    	customerQuestionsRepository.save(cq);
    }

    @Override
    public List<CustomerQuestions> getAllCustomerQuestions() {
        return customerQuestionsRepository.findAll();
    }

    @Override
    public Optional<CustomerQuestions> getCustomerQuestionsById(Long qid) {
        return customerQuestionsRepository.findById(qid);
    }
   

    @Override
    public int countCustomerQuestions() {
        List<CustomerQuestions> allCq = customerQuestionsRepository.findAll();
        return allCq.size();
    }


    @Override
    public List<CustomerQuestions> findCustomerQuestionsByEmail(String email) {
        return customerQuestionsRepository.findByCustomeremail(email);
    }



}
