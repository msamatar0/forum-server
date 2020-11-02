package com.project.controller;

import java.util.List;

import com.project.model.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class QuestionController {
    @Autowired
    private QuestionRepository repo;
    
    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return repo.findAll();
    }

    @GetMapping("/{question_id}}")
    public Question getById(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @GetMapping("/{survey_id}")
    public Question getBySurveyId(@PathVariable("survey_id") int id) {
        return repo.findBySurveyId(id);
    }

    @PostMapping("/question")
    public void addQuestion(@RequestBody Question ques) {
        repo.save(ques);
    }
}
