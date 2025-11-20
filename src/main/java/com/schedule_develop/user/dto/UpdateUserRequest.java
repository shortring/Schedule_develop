package com.schedule_develop.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UpdateUserRequest {
    @NotBlank
    private String name;
    @Email
    private String email;
//    @Size(min = 4, max = 16)
//    private String modifyPassword;
}
