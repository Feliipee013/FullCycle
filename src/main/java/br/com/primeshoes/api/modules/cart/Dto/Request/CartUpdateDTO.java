package br.com.primeshoes.api.modules.cart.Dto.Request;

import br.com.primeshoes.api.modules.user.Entity.User;

public record CartUpdateDTO(
		long id,
		User user
		) {

}
