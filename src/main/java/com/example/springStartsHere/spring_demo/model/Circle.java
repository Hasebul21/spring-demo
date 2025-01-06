package com.example.springStartsHere.spring_demo.model;

import org.springframework.stereotype.Component;

public class Circle {

    private String color;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void getColorName(){
        System.out.println("Just printing the Circle "+this.color +" color");
    }
}
