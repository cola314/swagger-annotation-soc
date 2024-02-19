package com.example.swaggerannotationsoc.dto;

public record AccountResponse(
        String username,
        String password,
        String email,
        int age,
        AccountType accountType) {
}
