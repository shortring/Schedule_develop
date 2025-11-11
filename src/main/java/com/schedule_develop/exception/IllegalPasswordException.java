package com.schedule_develop.exception;

public class IllegalPasswordException extends RuntimeException {
    public IllegalPasswordException(String message) {
        super(message);
    }
}
