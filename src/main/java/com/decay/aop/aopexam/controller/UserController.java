package com.decay.aop.aopexam.controller;

import com.decay.aop.aopexam.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    TaskService taskService;
    @GetMapping("/task")
    public String executeTask() {
        System.out.println("Fetching task");
        taskService.getTask();
        return "Task Executed!";
    }
}
