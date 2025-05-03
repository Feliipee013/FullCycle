package br.com.primeshoes.api.modules.user.Dto;

import java.time.Instant;

import br.com.primeshoes.api.modules.role.Enum.Role;

public record UserResponseDTO(
		long id,
		String name,
		String email,
		String password,
		Role role,
		Instant created_at,
		Instant updated_at
		) {}
