package br.com.primeshoes.api.dtos.Cart;

import br.com.primeshoes.api.entities.User.User;

public record CartCreateDTO(
		User user
		) {}
