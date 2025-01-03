package com.example.springStartsHere.spring_demo;

import com.example.springStartsHere.spring_demo.services.PublishCommentService;
import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringDemoApplication {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = c.getBean(PublishCommentService.class);

		var val = service.publishComment("Hey are you there");
		logger.info(val);

	}

}
