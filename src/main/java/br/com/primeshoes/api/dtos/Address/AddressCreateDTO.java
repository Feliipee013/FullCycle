package br.com.primeshoes.api.dtos.Address;

import br.com.primeshoes.api.entities.User.User;

public record AddressCreateDTO(
		String street,
		String number,
		String neighborhood,
		String city,
		String state,
		String compliment,
		long zipcode,
		User user
		) {}
