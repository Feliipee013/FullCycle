package br.com.primeshoes.api.modules.review.Dto.Request;

import br.com.primeshoes.api.modules.product.Entity.ProductVariation;
import br.com.primeshoes.api.modules.user.Entity.User;

public record ReviewUpdateDTO(
		long id,
		int rating,
		String comment,
		User user,
		ProductVariation productVariation
		) {}
