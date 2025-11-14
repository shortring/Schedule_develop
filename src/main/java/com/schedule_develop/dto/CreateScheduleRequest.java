package com.schedule_develop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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