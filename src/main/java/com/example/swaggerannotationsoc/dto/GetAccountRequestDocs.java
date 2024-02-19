package com.example.swaggerannotationsoc.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(title = "사용자 생성 요청 dto")
public interface GetAccountRequestDocs {
    @Schema(description = "이름", requiredMode = Schema.RequiredMode.REQUIRED)
    String username();

    @Schema(description = "비밀번호", requiredMode = Schema.RequiredMode.REQUIRED)
    String password();

    @Schema(description = "이메일", example = "user@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String email();

    @Schema(description = "나이")
    int age();

    @Schema(description = "계정 종류", defaultValue = "USER")
    AccountType accountType();
}
