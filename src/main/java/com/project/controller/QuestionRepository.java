package com.project.controller;

import java.util.List;

import com.project.model.Question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@CrossOrigin("http://localhost:4200")
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    public List<Question> findAll();
    public Question findById(@RequestParam("id") int id);
    public Question findBySurveyId(@RequestParam("survey_id") int serverId);
}
