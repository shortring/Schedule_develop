package com.schedule_develop.user.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateUserResponse {
    private final long scheduleId;
    private final String nickName;
    private final String name;
    private final String email;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public UpdateUserResponse(long scheduleId, String nickName, String name, String email, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.scheduleId = scheduleId;
        this.nickName = nickName;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
