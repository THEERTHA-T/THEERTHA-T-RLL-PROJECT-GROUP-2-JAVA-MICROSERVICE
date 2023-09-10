package com.ipm.customer.question.ipmcustomerquestion.services;


import java.util.List;
import java.util.Optional;

import com.ipm.customer.question.ipmcustomerquestion.entity.CustomerQuestions;

public interface CustomerQuestionsService {

    void saveCustomerQuestions(CustomerQuestions cq);

    List<CustomerQuestions> getAllCustomerQuestions();
    Optional<CustomerQuestions> getCustomerQuestionsById(Long qid);

    
 

    List<CustomerQuestions> findCustomerQuestionsByEmail(String email);

    int countCustomerQuestions();

}
