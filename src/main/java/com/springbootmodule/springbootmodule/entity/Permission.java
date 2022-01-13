package com.springbootmodule.springbootmodule.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Permission {
    USERS_READ("users:read"),
    USERS_WRITE("users:write");

    private final String permission;
}
