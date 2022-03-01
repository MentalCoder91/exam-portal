package com.example.examportal.Controller;


import com.example.examportal.Model.Question;
import com.example.examportal.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionController {


    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/hello")
    public String Hello(){


        return "Hello";
    }


    @GetMapping("/questions")
    public List<Question> getAllQuestions(){

        return questionRepository.findAll();

    }


}
