package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.enums.Role;

public record UserUpdateDTO(
		long id,
		String name,
		String email,
		String password,
		Role role) {}
