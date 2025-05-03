package br.com.primeshoes.api.modules.cart.Mapper;

import br.com.primeshoes.api.modules.cart.Dto.CartCreateDTO;
import br.com.primeshoes.api.modules.cart.Dto.CartResponseDTO;
import br.com.primeshoes.api.modules.cart.Entity.Cart;

public class CartMapper {
	
	public static CartResponseDTO toDTO(Cart cart) {
		System.out.println("CartMapper.toDTO");
		System.out.println(cart);
        return new CartResponseDTO(cart.getId(), (int) cart.getUser().getId());
	}
	
	public static Cart toEntity(CartCreateDTO cartCreateDTO) {
		Cart cart = new Cart();
		cart.setUser(cartCreateDTO.user());
		return cart;
	}
}
