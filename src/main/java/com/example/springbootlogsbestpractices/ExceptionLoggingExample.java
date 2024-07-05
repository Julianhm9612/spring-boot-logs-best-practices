package com.example.springbootlogsbestpractices;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLoggingExample {

    private static final Logger logger = Logger.getLogger(ExceptionLoggingExample.class.getName());

    public void doSomething() {
        try {
            // Code that may throw an exception
            throw new IllegalArgumentException("Invalid argument provided");
        } catch (IllegalArgumentException e) {
            // Log the exception with sufficient context information
            logger.log(Level.SEVERE, "An error occurred: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        ExceptionLoggingExample example = new ExceptionLoggingExample();
        example.doSomething();
    }
}
