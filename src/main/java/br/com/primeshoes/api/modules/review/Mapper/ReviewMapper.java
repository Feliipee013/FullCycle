package br.com.primeshoes.api.modules.review.Mapper;

import br.com.primeshoes.api.modules.review.Dto.ReviewCreateDTO;
import br.com.primeshoes.api.modules.review.Dto.ReviewResponseDTO;
import br.com.primeshoes.api.modules.review.Entity.Review;

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
