package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.enums.OrderStatus;
import br.com.primeshoes.api.enums.PaymentMethod;

public record OrderUpdateDTO(
		long id,
		float totalPrice,
		OrderStatus status,
		PaymentMethod paymentMethod,
		String trackingCode
		) {}
