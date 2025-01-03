package com.example.springStartsHere.spring_demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around ("execution(* com.example.springStartsHere.spring_demo.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        var methodName = joinPoint.getSignature().getName();
        Object [] args = joinPoint.getArgs();
        logger.info("Method " + methodName +   " with parameters " + Arrays.asList(args) + " will execute");
        var r = joinPoint.proceed();
        logger.info("Method executed");
        return r;

    }
}
