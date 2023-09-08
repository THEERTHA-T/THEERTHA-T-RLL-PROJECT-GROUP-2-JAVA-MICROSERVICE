package com.questions.services;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questions.entities.PublicQuestion;
@Repository(value = "questionRepository")
@Scope("singleton")
public interface QuestionRepository extends JpaRepository<PublicQuestion, Long> {

	boolean existsById(Long id);


	void deleteById(Long id);

	Optional<PublicQuestion> findById(Long id);
}
