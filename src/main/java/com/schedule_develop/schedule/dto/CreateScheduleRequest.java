package com.schedule_develop.schedule.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CreateScheduleRequest {
    // 속성
    @NotBlank
    private String title;
    @NotBlank
    private String content;

    // 생성자

    // 기능
}