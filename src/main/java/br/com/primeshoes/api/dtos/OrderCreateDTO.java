package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entites.User;
import br.com.primeshoes.api.enums.OrderStatus;

public record OrderCreateDTO(
		User user,
		float totalPrice,
		OrderStatus status,
		String paymentMethod
		//String trackingCode
		) {}
