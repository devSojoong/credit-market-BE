package com.example.creditmarket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserLoginRequestDTO {

    private String userEmail;
    private String userPassword;
}