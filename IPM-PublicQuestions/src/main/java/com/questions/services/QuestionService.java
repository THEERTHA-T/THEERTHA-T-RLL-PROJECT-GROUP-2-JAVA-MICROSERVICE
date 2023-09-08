package com.questions.services;

import java.util.List;




import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.questions.entities.PublicQuestion;


@Service(value = "questionService")
@Scope("singleton")
@Transactional
public class QuestionService implements IQuestionService {

    @Autowired
    @Qualifier("questionRepository")
    private QuestionRepository questionRepository;

    // @Override
    // public List<Question> getAllSms() {
    //     // TODO Auto-generated method stub
    //     return questionRepository.findAll();
    // }

    @Override
    public String deleteSms(Long id) {
        // Check if the question with the given ID exists
        if (questionRepository.existsById(id)) {
            // Get the deleted question for logging
            PublicQuestion deletedQuestion = questionRepository.findById(id).orElse(null);

            questionRepository.deleteById(id);

            // Print the ID of the deleted question
            System.out.println("Deleted question with ID: " + id);

            // You can also print other details of the deleted question if needed
            if (deletedQuestion != null) {
                System.out.println("Deleted question details: " + deletedQuestion.toString());
            }

            return "Question with ID " + id + " deleted successfully";
        } else {
            return "Question with ID " + id + " not found";
        }
    }

	// @Override
	// public void saveSms(Question sms) {
	// 	// TODO Auto-generated method stub
	//     try {
	//         // Save the provided question object to the database
	//         questionRepository.save(sms);
	//         System.out.println("Saved question with ID: " + sms.getId()); // Print the saved question ID for logging
	//     } catch (Exception e) {
	//         e.printStackTrace(); // Log the exception details
	//         throw new ProjectExecption("An error occurred while saving the SMS.");
	//     }
	// }

 
    public PublicQuestion saveSms(PublicQuestion sms) {
       
       return questionRepository.save(sms);

}

    @Override
    public List<PublicQuestion> getAllSms() {
        return questionRepository.findAll();
        
    }}

