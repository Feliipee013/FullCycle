package br.com.primeshoes.api.dtos.Product;

public record ProductCreateDTO(
		String name,
		String description,
		float price,
		String category,
		String brand,
		String imageUrl,
		float rating
		) {}
