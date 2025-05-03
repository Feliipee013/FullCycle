package br.com.primeshoes.api.dtos.Login;

public record LoginResponseDto (
        String token,
        Long expiresIn
){}
