package com.schedule_develop.dto;

import lombok.Getter;

@Getter
public class DeleteUserRequest {
    private final String password;

    public DeleteUserRequest(String password) {
        this.password = password;
    }
}
