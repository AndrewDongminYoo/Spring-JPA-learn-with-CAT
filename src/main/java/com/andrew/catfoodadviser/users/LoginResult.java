package com.andrew.catfoodadviser.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@RequiredArgsConstructor
public class LoginResult {

    private final String token;
    private final UserDto user;
}