package com.decay.aop.aopexam.apo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class ExecutionTimeAspect {
    @Before("execution(* com.decay.aop.aopexam.controller.*.*(..))*")
    public void beforControllerAdvice(JoinPoint joinpoint){
        System.out.println("requst to "+joinpoint.getSignature() + " started "+ new Date());
    }
    @After("execution(* com.decay.aop.aopexam.controller.*.*(..))*")
    public void afterControllerAdvice(JoinPoint joinpoint){
        System.out.println("requst to "+joinpoint.getSignature() + " started "+ new Date());
    }
    @Before("execution(* com.decay.aop.aopexam.service.TaskService.getTask(..))")
    public void beforeServiceAdvice(JoinPoint joinpoint){
        System.out.println("requst to "+joinpoint.getSignature() + " started "+ new Date());
    }

    @After("execution(* com.decay.aop.aopexam.service.TaskService.getTask(..))")
    public void afterServiceAdvice(JoinPoint joinpoint){
        System.out.println("requst to "+joinpoint.getSignature() + " started "+ new Date());
    }
}
