package com.schedule_develop.dto;

import com.schedule_develop.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetScheduleResponse {
    private final long scheduleId;
    private final String title;
    private final String content;
    private final long userId;
    private final String userName;
    private final String userEmail;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;


    public GetScheduleResponse(long scheduleId, String title, String content, User user, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.scheduleId = scheduleId;
        this.title = title;
        this.content = content;
        this.userId = user.getId();
        this.userName = user.getName();
        this.userEmail = user.getEmail();
//        this.user = new User(
//                user.getName(),
//                user.getEmail(),
//                user.getPassword()
//        );
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}