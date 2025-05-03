package br.com.primeshoes.api.dtos.Cart;

import br.com.primeshoes.api.entities.User.User;

public record CartUpdateDTO(
		long id,
		User user
		) {

}
