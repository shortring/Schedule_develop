package com.schedule_develop.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class DeleteScheduleRequest {
    // 속성
    @Size(min = 4, max = 16)
    private String password;
}
