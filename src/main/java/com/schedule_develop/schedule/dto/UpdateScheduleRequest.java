package com.schedule_develop.schedule.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UpdateScheduleRequest {
    // 속성
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotBlank
    private String password;
}