package br.com.primeshoes.api.modules.promotion.Mapper;

import br.com.primeshoes.api.modules.promotion.Dto.PromotionCreateDTO;
import br.com.primeshoes.api.modules.promotion.Dto.PromotionResponseDTO;
import br.com.primeshoes.api.modules.promotion.Entity.Promotion;

public class PromotionMapper {
	public static PromotionResponseDTO toDTO(Promotion promotion) {
		return new PromotionResponseDTO(promotion.getId(), promotion.getName(), promotion.getDiscountPercentage(), promotion.getStartDate(), promotion.getEndDate(), promotion.isActive(), promotion.getProductVariation());
	}
	
	public static Promotion toEntity(PromotionCreateDTO promotionCreateDTO) {
		Promotion promotion = new Promotion();
		promotion.setName(promotionCreateDTO.name());
		promotion.setDiscountPercentage(promotionCreateDTO.discountPercentage());
		promotion.setStartDate(promotionCreateDTO.startDate());
		promotion.setEndDate(promotionCreateDTO.endDate());
		promotion.setActive(promotionCreateDTO.isActive());
		promotion.setProductVariation(promotionCreateDTO.productVariation());
		
		return promotion;
	}
}
