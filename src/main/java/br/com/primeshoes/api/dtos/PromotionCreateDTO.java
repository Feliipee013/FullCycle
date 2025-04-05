package br.com.primeshoes.api.dtos;

import java.time.Instant;

import br.com.primeshoes.api.entities.ProductVariation;

public record PromotionCreateDTO(
		String name,
		float discountPercentage,
		Instant startDate,
		Instant endDate,
		boolean isActive,
		ProductVariation productVariation
		) {}
