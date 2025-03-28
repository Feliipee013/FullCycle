package br.com.primeshoes.api.dtos;

public record UserResponseDTO(
		long id,
		String name,
		String email,
		boolean admin
		) {}
