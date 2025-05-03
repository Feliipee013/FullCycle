package br.com.primeshoes.api.dtos.User;

import java.time.Instant;

import br.com.primeshoes.api.enums.Role;

public record UserResponseDTO(
		long id,
		String name,
		String email,
		String password,
		Role role,
		Instant created_at,
		Instant updated_at
		) {}
