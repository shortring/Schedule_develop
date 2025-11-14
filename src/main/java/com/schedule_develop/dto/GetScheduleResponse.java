package com.schedule_develop.dto;

import com.schedule_develop.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetScheduleResponse {
    private final long scheduleId;
    private final String title;
    private final String content;
    private final User user;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;


    public GetScheduleResponse(long scheduleId, String title, String content, User user, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.scheduleId = scheduleId;
        this.title = title;
        this.content = content;
        this.user = new User(
                user.getName(),
                user.getEmail()
        );
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}