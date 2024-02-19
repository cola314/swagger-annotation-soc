package com.example.swaggerannotationsoc.controller;

import com.example.swaggerannotationsoc.dto.AccountResponse;
import com.example.swaggerannotationsoc.dto.CreateAccountRequest;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController implements AccountControllerDocs {

    @Override
    @PostMapping
    public AccountResponse createAccount(CreateAccountRequest createAccountRequest) {
        throw new NotImplementedException();
    }
}
