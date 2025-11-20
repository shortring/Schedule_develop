package com.schedule_develop.common.exception;

import org.springframework.http.HttpStatus;

public class BadInputRequestException extends ServiceException {
    public BadInputRequestException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
