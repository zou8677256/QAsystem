package com.ryz.qasystem.controller;

import com.ryz.qasystem.dto.QuestionDTO;
import com.ryz.qasystem.model.RespPageBean;
import com.ryz.qasystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/")
    public RespPageBean getAllQuestionsByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer size){
        return questionService.getAllQuestionsByPage(page, size);
    }

    @GetMapping("/{id}")
    public QuestionDTO getQuestionById(@PathVariable Integer id){
        questionService.incView(id);
        return questionService.getQuestionById(id);
    }

    @GetMapping("/profile/{id}")
    public RespPageBean getUserQuestionsByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer size, @PathVariable Integer id){
        return questionService.getUserQuestionsByPage(page, size, id);
    }
}
