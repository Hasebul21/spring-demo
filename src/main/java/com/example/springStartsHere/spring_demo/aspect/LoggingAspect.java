package com.example.springStartsHere.spring_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    @Before("execution(void com.example.springStartsHere.spring_demo.*.*.get*(..))")
    public void logBefore() {
        System.out.println("Advice before method");
    }
}
