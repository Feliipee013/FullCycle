package br.com.primeshoes.api.modules.product.Dto;

import java.sql.Date;

public record ProductResponseDTO(
		long id,
		String name,
		String description,
		float price,
		String category,
		String brand,
		String imageUrl,
		float rating,
		Date created_at,
		Date updated_at
		) {}
