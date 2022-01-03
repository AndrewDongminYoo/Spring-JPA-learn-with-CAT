package com.andrew.catfoodadviser.users;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDateTime;

import static org.springframework.beans.BeanUtils.copyProperties;

@Data
public class UserDto {

    private String name;
    private Email email;
    private int loginCount;
    private LocalDateTime lastLoginAt;
    private LocalDateTime createAt;

    public UserDto(User source) {
        copyProperties(source, this);
        this.lastLoginAt = source.getLastLoginAt();
    }
}