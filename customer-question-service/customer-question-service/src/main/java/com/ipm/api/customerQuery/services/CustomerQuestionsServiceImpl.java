package com.ipm.api.customerQuery.services;

import com.ipm.api.customerQuery.entity.CustomerQuestions;
import com.ipm.api.customerQuery.TodysDate;
import com.ipm.api.customerQuery.repositories.CustomerQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void updateCustomerQuestions(Long qid, CustomerQuestions cq) {
        Optional<CustomerQuestions> optionalCq = cqRepository.findById(qid);
        if (optionalCq.isPresent()) {
            CustomerQuestions existingCq = optionalCq.get();
            existingCq.setAnswerdate(TodysDate.todayDate());
            existingCq.setQanswer(cq.getQanswer());
            cqRepository.save(existingCq);
        }
    }

    @Override
    public void deleteCustomerQuestionsById(Long qid) {
        cqRepository.deleteById(qid);
    }

    @Override
    public List<CustomerQuestions> findCustomerQuestionsByEmail(String email) {
        return cqRepository.findAllByCustomeremail(email);
    }

    @Override
    public int countCustomerQuestions() {
        List<CustomerQuestions> allCq = cqRepository.findAll();
        return allCq.size();
    }
}
