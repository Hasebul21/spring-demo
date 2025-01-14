package com.example.demo.controller;

import com.example.demo.service.SessionApplicationScope;
import com.example.demo.service.SessionScopeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeController {

    public final SessionScopeService sessionScopeService;
    private final SessionApplicationScope sessionApplicationScope;
    private final HttpSession httpSession;

    public ScopeController(SessionScopeService sessionScopeService,
                           SessionApplicationScope sessionApplicationScope,
                           HttpSession httpSession) {
        this.sessionApplicationScope = sessionApplicationScope;
        this.sessionScopeService = sessionScopeService;
        this.httpSession = httpSession;
    }

    @PostMapping("/set")
    public void getMessage(@RequestParam String message) {
        sessionApplicationScope.incrementCounter();
        System.out.println("Session ID: " + httpSession.getId());
        sessionScopeService.setMessage(message);
    }

    @GetMapping("/get")
    public String getMessage() {
        sessionApplicationScope.incrementCounter();
        System.out.println("Session ID: " + httpSession.getId());
        String val = sessionScopeService.getMessage();
        return val;
    }

    @GetMapping("/counter")
    public int getCounter() {
        return sessionApplicationScope.getCounter();
    }
}
