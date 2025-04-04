package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.enums.OrderStatus;

public record OrderUpdateDTO(
		long id,
		float totalPrice,
		OrderStatus status,
		String paymentMethod
		) {}
