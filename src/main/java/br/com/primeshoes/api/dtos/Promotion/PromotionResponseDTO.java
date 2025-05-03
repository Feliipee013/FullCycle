package br.com.primeshoes.api.dtos.Promotion;

import java.time.Instant;

import br.com.primeshoes.api.entities.Product.ProductVariation;

public record PromotionResponseDTO(
		long id,
		String name,
		float discountPercentage,
		Instant startDate,
		Instant endDate,
		boolean isActive,
		ProductVariation productVariation
		) {}
