package com.example.springbootlogsbestpractices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {

    private static final Logger logger = LogManager.getLogger(Log4jExample.class);

    public void doSomething() {
        try {
            // Code that may throw an exception
            throw new NullPointerException("Null value encountered");
        } catch (NullPointerException e) {
            // Log the exception with Log4j
            logger.error("An error occurred: {}", e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        Log4jExample example = new Log4jExample();
        example.doSomething();
    }
}
