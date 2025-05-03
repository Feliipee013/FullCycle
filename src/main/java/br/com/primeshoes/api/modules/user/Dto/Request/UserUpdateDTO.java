package br.com.primeshoes.api.modules.user.Dto.Request;

import br.com.primeshoes.api.modules.role.Enum.Role;

public record UserUpdateDTO(
		long id,
		String name,
		String email,
		String password,
		Role role) {}
