package com.questions.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.questions.entities.PublicQuestion;

public interface IQuestionService {

	List<PublicQuestion> getAllSms();

	String deleteSms(@PathVariable("id") Long id);

     PublicQuestion saveSms(PublicQuestion sms);


	
 
}

