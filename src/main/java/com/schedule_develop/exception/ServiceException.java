package com.schedule_develop.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ServiceException extends RuntimeException {
    // 속성
    private final HttpStatus status;

    // 생성자
    public ServiceException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    // 기능
}
