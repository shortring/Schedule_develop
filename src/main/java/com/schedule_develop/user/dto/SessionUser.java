package com.schedule_develop.user.dto;

import lombok.Getter;

@Getter
public class SessionUser {
    private final Long id;
    private final String name;

    public SessionUser(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
