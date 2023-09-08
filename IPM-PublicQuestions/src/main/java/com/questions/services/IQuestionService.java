package com.questions.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.ipm.api.publicQuestion.PublicQuestion;
import com.questions.entities.Question;

public interface IQuestionService {

	List<Question> getAllSms();

	String deleteSms(@PathVariable("id") Integer id);

     void saveSms(PublicQuestion sms);


	
 
}

