package com.example.webapp.service;

public class GreetingService {

    public String generateGreeting(String name) {

        if (name == null || name.trim().isEmpty()) {
            return "Hello, Guest!";
        }

        return "Hello, " + name.trim() + "!";
    }
}