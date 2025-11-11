package com.schedule_develop.exception;

import org.springframework.http.HttpStatus;

public class ScheduleNotFoundException extends ServiceException{
    // 속성

    // 생성자
    public ScheduleNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
    // 기능
}
