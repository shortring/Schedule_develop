package com.schedule_develop.dto;

import com.schedule_develop.entity.User;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UpdateScheduleRequest {
    // 속성
    @NotBlank
    private String title;
    @NotBlank
    private User user;
}