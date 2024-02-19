package com.example.swaggerannotationsoc.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record CreateAccountRequest(
        @NotEmpty
        String username,

        @NotEmpty
        @Length(min = 9, max = 30)
        String password,

        @Email
        String email,

        @Min(18)
        int age,

        @NotNull
        AccountType accountType) implements GetAccountRequestDocs {
}
