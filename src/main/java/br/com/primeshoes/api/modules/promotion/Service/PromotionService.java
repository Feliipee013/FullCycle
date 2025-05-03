package br.com.primeshoes.api.modules.promotion.Service;

import java.util.List;

import br.com.primeshoes.api.modules.promotion.Dto.Request.PromotionCreateDTO;
import br.com.primeshoes.api.modules.promotion.Dto.Response.PromotionResponseDTO;
import br.com.primeshoes.api.modules.promotion.Dto.Request.PromotionUpdateDTO;
import br.com.primeshoes.api.modules.promotion.Entity.Promotion;
import br.com.primeshoes.api.modules.promotion.Mapper.PromotionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.modules.promotion.Repository.PromotionRepository;

@Service
public class PromotionService {
	
	@Autowired
	PromotionRepository promotionRepository;
	
	public PromotionResponseDTO store(PromotionCreateDTO promotionCreateDTO) {
		Promotion promotion = PromotionMapper.toEntity(promotionCreateDTO);
		Promotion promotionResponse = promotionRepository.save(promotion);
		return PromotionMapper.toDTO(promotionResponse);
	}
	
	public List<PromotionResponseDTO> list() {
		return promotionRepository.findAll().stream().map(PromotionMapper::toDTO).toList();
	}
	
	public PromotionResponseDTO show(long id) {
		Promotion promotion = promotionRepository
				.findById(id)
				.orElseThrow(()->new RuntimeException("Promoção com id " + id + " não foi encontrada")
						);
		return PromotionMapper.toDTO(promotion);
	}
	
	public PromotionResponseDTO update(PromotionUpdateDTO promotionUpdateDTO) {
		Promotion promotion = promotionRepository
				.findById(promotionUpdateDTO.id())
				.orElseThrow(()->new RuntimeException("Promoção não encontrada para alteração"));
		promotion.setName(promotionUpdateDTO.name());
		promotion.setDiscountPercentage(promotionUpdateDTO.discountPercentage());
		promotion.setStartDate(promotionUpdateDTO.startDate());
		promotion.setEndDate(promotionUpdateDTO.endDate());
		promotion.setActive(promotionUpdateDTO.isActive());
		promotion.setProductVariation(promotionUpdateDTO.productVariation());
		
		return PromotionMapper.toDTO(promotionRepository.save(promotion));
	}
	
	public void destroy(long id) {
		Promotion promotion = promotionRepository
				.findById(id)
				.orElseThrow(()-> new RuntimeException("Promoção não encontrada"));
		promotionRepository.delete(promotion);
	}
}
