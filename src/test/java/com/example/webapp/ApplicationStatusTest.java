package com.example.webapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplicationStatusTest {

    @Test
    void returnsSuccessfulApplicationMessage() {
        assertEquals("Application is running successfully!", ApplicationStatus.message());
    }
}