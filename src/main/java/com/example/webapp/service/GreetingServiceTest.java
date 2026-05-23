package com.example.webapp.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {

    private final GreetingService greetingService =
            new GreetingService();

    @Test
    void shouldReturnGreetingForValidName() {

        String result = greetingService
                .generateGreeting("Thrilok");

        assertEquals("Hello, Thrilok!", result);
    }

    @Test
    void shouldReturnGuestGreetingWhenNameIsEmpty() {

        String result = greetingService
                .generateGreeting("");

        assertEquals("Hello, Guest!", result);
    }

    @Test
    void shouldTrimSpacesFromName() {

        String result = greetingService
                .generateGreeting("   John   ");

        assertEquals("Hello, John!", result);
    }
}