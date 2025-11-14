package com.schedule_develop.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CreateUserRequest {
    @NotBlank
    private String name;
    @Email
    private String email;
//    @Size(min = 4, max = 16)
//    private String password;
}
