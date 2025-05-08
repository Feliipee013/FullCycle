package br.com.primeshoes.api.modules.auth.Login.Dto.Request;

public record LoginUserDto(
        String Email,
        String Password
) {}
