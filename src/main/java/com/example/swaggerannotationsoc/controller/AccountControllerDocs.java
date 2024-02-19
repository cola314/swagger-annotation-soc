package com.example.swaggerannotationsoc.controller;

import com.example.swaggerannotationsoc.dto.AccountResponse;
import com.example.swaggerannotationsoc.dto.CreateAccountRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "accounts", description = "계정 API")
public interface AccountControllerDocs {

    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "계정 생성 성공",
                    content = @Content(schema = @Schema(implementation = AccountResponse.class))),
            @ApiResponse(
                    responseCode = "400",
                    description = "잘못된 요청"),
    })
    @Operation(summary = "계정 생성", description = "게정을 생성하고 계정 정보를 보여줍니다")
    AccountResponse createAccount(CreateAccountRequest createAccountRequest);
}
