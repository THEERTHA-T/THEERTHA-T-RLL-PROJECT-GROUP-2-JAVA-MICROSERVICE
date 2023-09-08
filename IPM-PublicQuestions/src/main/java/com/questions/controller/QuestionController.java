package com.questions.controller;

import java.util.List;


import com.questions.exception.ProjectExecption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.questions.entities.PublicQuestion;
import com.questions.services.IQuestionService;

@RestController
@Scope("request")
public class QuestionController {
	
	@Autowired
	@Qualifier("questionService")
	public IQuestionService questionService;
	HttpStatus hs;
	
	// Get Unknown sms
		@GetMapping("/getunknownsms")
		
		public List<PublicQuestion> getsmss() {
			return questionService.getAllSms();
		}

		
		// Delete Unknown sms
		@DeleteMapping("/deleteunknownsms/{id}")
		public String deleteSms(@PathVariable("id") Long id) {
		   

		    String result = questionService.deleteSms(id);
		    
		    // Print the ID
		    System.out.println("Deleted question with ID: " + id);

		    return result;
		}
		

		// Save All Unknown sms

		@PostMapping("/addunknowsms")
		public HttpStatus saveSms(@RequestBody PublicQuestion sms) {

			try {
				questionService.saveSms(sms);
				return HttpStatus.CREATED;
			} catch (Exception e) {
				e.printStackTrace(); // Log the exception details
				throw new ProjectExecption("An error occurred while saving the SMS.");
			}

		}
		
		}
