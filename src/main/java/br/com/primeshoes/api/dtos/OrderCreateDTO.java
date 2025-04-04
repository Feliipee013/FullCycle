package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entites.User;
import br.com.primeshoes.api.enums.OrderStatus;
import br.com.primeshoes.api.enums.PaymentMethod;

public record OrderCreateDTO(
		User user,
		float totalPrice,
		OrderStatus status,
		PaymentMethod paymentMethod,
		String trackingCode
		) {}
