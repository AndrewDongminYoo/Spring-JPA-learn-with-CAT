package com.andrew.catfoodadviser.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class LoginRequest {

    @NotBlank(message = "principal must be provided")
    private String principal;

    @NotBlank(message = "credentials must be provided")
    private String credentials;
}