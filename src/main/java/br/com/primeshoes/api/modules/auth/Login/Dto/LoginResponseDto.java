package br.com.primeshoes.api.modules.auth.Login.Dto;

public record LoginResponseDto (
        String token,
        Long expiresIn
){}