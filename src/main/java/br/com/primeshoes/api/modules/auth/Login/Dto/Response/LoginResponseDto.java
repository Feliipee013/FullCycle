package br.com.primeshoes.api.modules.auth.Login.Dto.Response;

public record LoginResponseDto (
        String token,
        Long expiresIn
){}