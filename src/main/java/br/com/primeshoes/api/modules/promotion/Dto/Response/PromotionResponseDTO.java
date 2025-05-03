package br.com.primeshoes.api.modules.promotion.Dto.Response;

import java.time.Instant;

import br.com.primeshoes.api.modules.product.Entity.ProductVariation;

public record PromotionResponseDTO(
		long id,
		String name,
		float discountPercentage,
		Instant startDate,
		Instant endDate,
		boolean isActive,
		ProductVariation productVariation
		) {}
