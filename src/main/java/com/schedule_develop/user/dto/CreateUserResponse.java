package com.schedule_develop.user.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateUserResponse {
    private final long userId;
    private final String name;
    private final String email;
    private final String nickName;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public CreateUserResponse(long userId, String name, String email, String nickName, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.nickName = nickName;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;

    }
}