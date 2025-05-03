package br.com.primeshoes.api.mappers.Review;

import br.com.primeshoes.api.dtos.Review.ReviewCreateDTO;
import br.com.primeshoes.api.dtos.Review.ReviewResponseDTO;
import br.com.primeshoes.api.entities.Review.Review;

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
