package com.questions.services;

import java.util.List;



import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questions.entities.Question;
@Repository(value = "questionRepository")
@Scope("singleton")
public interface QuestionRepository extends JpaRepository<Question, Integer> {
//    void deleteById(Integer id);
//
//    boolean existsById(Integer id);
}
