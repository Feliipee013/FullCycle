package br.com.primeshoes.api.modules.adress.Dto.Response;

import br.com.primeshoes.api.modules.user.Entity.User;

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
