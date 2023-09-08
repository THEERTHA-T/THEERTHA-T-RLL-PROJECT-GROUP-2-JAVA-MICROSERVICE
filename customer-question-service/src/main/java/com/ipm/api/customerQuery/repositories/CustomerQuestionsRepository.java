package com.ipm.api.customerQuery.repositories;

import com.ipm.api.customerQuery.entity.CustomerQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerQuestionsRepository extends JpaRepository<CustomerQuestions, Long> {

    List<CustomerQuestions> findAllByCustomeremail(String customerEmail);

    // Add custom query methods if needed
}
