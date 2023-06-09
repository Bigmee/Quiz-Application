package com.example.quizzApp.repository;

import com.example.quizzApp.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<QuizQuestion, Long> {
    Optional<QuizQuestion> findById(long id);
}