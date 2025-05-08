package br.com.primeshoes.api.modules.order.Dto.Request;

import br.com.primeshoes.api.modules.order.Enum.OrderStatus;
import br.com.primeshoes.api.modules.payment.Enum.PaymentMethod;

public record OrderUpdateDTO(
		long id,
		float totalPrice,
		OrderStatus status,
		PaymentMethod paymentMethod
		) {}
