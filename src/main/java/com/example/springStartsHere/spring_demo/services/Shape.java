package com.example.springStartsHere.spring_demo.services;

import com.example.springStartsHere.spring_demo.model.Circle;
import com.example.springStartsHere.spring_demo.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Shape {

    private Triangle triangle;
    private Circle circle;
    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
