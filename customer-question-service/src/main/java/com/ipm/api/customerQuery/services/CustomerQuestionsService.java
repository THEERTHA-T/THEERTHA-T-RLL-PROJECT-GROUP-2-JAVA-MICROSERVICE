package com.ipm.api.customerQuery.services;


import com.ipm.api.customerQuery.entity.CustomerQuestions;

import java.util.List;
import java.util.Optional;

public interface CustomerQuestionsService {

    void saveCustomerQuestions(CustomerQuestions cq);

    List<CustomerQuestions> getAllCustomerQuestions();
    Optional<CustomerQuestions> getCustomerQuestionsById(Long qid);

    
 

    List<CustomerQuestions> findCustomerQuestionsByEmail(String email);

    int countCustomerQuestions();

}
