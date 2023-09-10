package com.ipm.customer.question.ipmcustomerquestion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipm.customer.question.ipmcustomerquestion.entity.CustomerQuestions;

@Repository
public interface CustomerQuestionsRepository extends JpaRepository<CustomerQuestions, Long> {

    List<CustomerQuestions> findByCustomeremail(String customeremail);
    // Add custom query methods if needed
}
