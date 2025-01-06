package com.example.springStartsHere.spring_demo;

import com.example.springStartsHere.spring_demo.aspect.LoggingAspect;
import com.example.springStartsHere.spring_demo.model.Circle;
import com.example.springStartsHere.spring_demo.model.Triangle;
import com.example.springStartsHere.spring_demo.services.Shape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.springStartsHere.spring_demo.*")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public Triangle triangle() {
        return new Triangle();
    }

    @Bean
    public Circle circle() {
        return new Circle();
    }

    @Bean
    public Shape shape() {
        return new Shape();
    }
}
