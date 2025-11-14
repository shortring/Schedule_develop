package com.schedule_develop.exception;

import org.springframework.http.HttpStatus;

public class ElementNotFoundException extends ServiceException{
    // 속성

    // 생성자
    public ElementNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
    // 기능
}
