package com.schedule_develop.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateUserRequest {
    @NotBlank(message = "name은 필수값입니다")
    private String name;
    @Email
    private String email;
    @Size(min = 4, max = 16)
    private String password;
    @NotBlank(message = "nickname은 필수값입니다")
    private String nickname;
}
