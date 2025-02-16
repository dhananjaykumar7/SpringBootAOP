package com.decay.aop.aopexam.service;

import org.springframework.stereotype.Service;

@Service
public class TaskImpl implements TaskService{
    @Override
    public void getTask() {
        System.out.print("Task service..");
    }
}
