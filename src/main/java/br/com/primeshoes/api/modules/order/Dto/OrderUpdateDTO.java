package br.com.primeshoes.api.modules.order.Dto;

import br.com.primeshoes.api.modules.order.Enum.OrderStatus;
import br.com.primeshoes.api.modules.payment.PaymentMethod;

public record OrderUpdateDTO(
		long id,
		float totalPrice,
		OrderStatus status,
		PaymentMethod paymentMethod
		) {}
