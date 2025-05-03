package br.com.primeshoes.api.dtos.User;

import br.com.primeshoes.api.enums.Role;

public record UserCreateDTO(
		String name,
		String email,
		String password,
		Role role
) {}
