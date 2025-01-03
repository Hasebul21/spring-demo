package com.example.springStartsHere.spring_demo.services;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PublishCommentService {

    private Logger logger = Logger.getLogger(PublishCommentService.class.getName());

    public String publishComment(String comment) {
        logger.info("Publishing comment:" + comment);
        return "SUCCESS";
    }
}
