package br.com.primeshoes.api.dtos.Review;

import br.com.primeshoes.api.entities.Product.ProductVariation;
import br.com.primeshoes.api.entities.User.User;

public record ReviewUpdateDTO(
		long id,
		int rating,
		String comment,
		User user,
		ProductVariation productVariation
		) {}
