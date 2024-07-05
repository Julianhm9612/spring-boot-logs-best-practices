package com.example.springbootlogsbestpractices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {
    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @GetMapping("/test")
    public String testLogging() {
        try {
            // Simulate an error
            throw new RuntimeException("Test exception");
        } catch (RuntimeException e) {
            // Log at different levels
            logger.debug("A debug message", e);
            logger.info("An informational message", e);
            logger.warn("A warning message", e);
            logger.error("An error message", e);
            throw e;
        }
    }
}
