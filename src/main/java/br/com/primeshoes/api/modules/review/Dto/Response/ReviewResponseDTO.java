package br.com.primeshoes.api.modules.review.Dto.Response;

import java.time.Instant;

import br.com.primeshoes.api.modules.product.Entity.ProductVariation;
import br.com.primeshoes.api.modules.user.Entity.User;

public record ReviewResponseDTO(
		long id,
		int rating,
		String comment,
		User user,
		ProductVariation productVariation,
		Instant created_at,
		Instant updated_at
		) {}
