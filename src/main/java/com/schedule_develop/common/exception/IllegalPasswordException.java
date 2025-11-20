package com.schedule_develop.common.exception;

import org.springframework.http.HttpStatus;

public class IllegalPasswordException extends ServiceException {
    public IllegalPasswordException(String message) {
        super(HttpStatus.UNAUTHORIZED, message);
    }
}
