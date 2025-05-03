package br.com.primeshoes.api.modules.promotion.Dto;

import java.time.Instant;

import br.com.primeshoes.api.modules.product.Entity.ProductVariation;

public record PromotionCreateDTO(
		String name,
		float discountPercentage,
		Instant startDate,
		Instant endDate,
		boolean isActive,
		ProductVariation productVariation
		) {}
