package br.com.primeshoes.api.mappers.Card;

import br.com.primeshoes.api.dtos.Cart.CartCreateDTO;
import br.com.primeshoes.api.dtos.Cart.CartResponseDTO;
import br.com.primeshoes.api.entities.Cart.Cart;

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
