package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entities.User;

public record AddressResponseDTO(
		long id,
		String street,
		String number,
		String neighborhood,
		String city,
		String state,
		String compliment,
		long zipcode,
		User user
		) {}
