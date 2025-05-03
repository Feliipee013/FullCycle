package br.com.primeshoes.api.modules.product.Mapper;

import br.com.primeshoes.api.modules.product.Dto.ProductCreateDTO;
import br.com.primeshoes.api.modules.product.Dto.ProductResponseDTO;
import br.com.primeshoes.api.modules.product.Entity.Product;

public class ProductMapper {
	public static ProductResponseDTO toDTO(Product product) {
		return new ProductResponseDTO(product.getId(), product.getName(),product.getDescription(), product.getPrice(), product.getCategory(), product.getBrand(), product.getImageUrl(),product.getRating(), product.getCreated_at(), product.getUpdated_at());
	}
	public static Product toEntity(ProductCreateDTO productCreateDTO) {
		Product product = new Product();
		product.setName(productCreateDTO.name());
		product.setDescription(productCreateDTO.description());
		product.setPrice(productCreateDTO.price());
		product.setCategory(productCreateDTO.category());
		product.setBrand(productCreateDTO.brand());
		product.setImageUrl(productCreateDTO.imageUrl());
		product.setRating(productCreateDTO.rating());
		return product;
	}
}
