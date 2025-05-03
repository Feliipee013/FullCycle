package br.com.primeshoes.api.modules.adress.Dto;

import br.com.primeshoes.api.modules.user.Entity.User;

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
