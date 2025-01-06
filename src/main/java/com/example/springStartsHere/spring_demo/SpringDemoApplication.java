package com.example.springStartsHere.spring_demo;

import com.example.springStartsHere.spring_demo.model.Circle;
import com.example.springStartsHere.spring_demo.model.Triangle;
import com.example.springStartsHere.spring_demo.services.PublishCommentService;
import com.example.springStartsHere.spring_demo.services.Shape;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringDemoApplication {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {


		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var shapeService = c.getBean(Shape.class);
		var circle = c.getBean(Circle.class);
		circle.setColor("blue");
		var triangle = c.getBean(Triangle.class);
		triangle.setColor("red");
		shapeService.setCircle(circle);
		shapeService.setTriangle(triangle);
		System.out.println(shapeService.getCircle().getColor());
		System.out.println(shapeService.getTriangle().getColor());
		shapeService.getCircle().getColorName();

	}

}
