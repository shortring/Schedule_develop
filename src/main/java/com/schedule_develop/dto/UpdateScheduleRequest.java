package com.schedule_develop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UpdateScheduleRequest {
    // 속성
    @NotBlank
    private String title;
    @NotBlank
    private String name;
    @Size(min = 4, max = 16)
    private String password;
}