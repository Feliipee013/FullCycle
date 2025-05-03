package br.com.primeshoes.api.modules.review.Dto;

import br.com.primeshoes.api.modules.product.Entity.ProductVariation;
import br.com.primeshoes.api.modules.user.Entity.User;

public record ReviewCreateDTO(
		int rating,
		String comment,
		User user,
		ProductVariation productVariation
		) {}
