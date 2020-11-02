package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "questions")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "answer")
    private String answer;

    @Column(name = "options")
    private String options;

    @Column(name = "prompt")
    private String prompt;

    @Column(name = "survey_id")
    private String surveyId;

    @Column(name = "type")
    private String type;
}
