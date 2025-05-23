package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.ReviewCreateDTO;
import br.com.primeshoes.api.dtos.ReviewResponseDTO;
import br.com.primeshoes.api.entities.Review;

public class ReviewMapper {
	
	public static ReviewResponseDTO toDTO(Review review) {
		return new ReviewResponseDTO(review.getId(), review.getRating(), review.getComment(), review.getUser(), review.getProductVariation(), review.getCreated_at(), review.getUpdated_at());
	}
	
	public static Review toEntity(ReviewCreateDTO reviewCreateDTO) {
		Review review = new Review();
		review.setRating(reviewCreateDTO.rating());
		review.setComment(reviewCreateDTO.comment());
		review.setUser(reviewCreateDTO.user());
		review.setProductVariation(reviewCreateDTO.productVariation());
		return review;
	}
}
