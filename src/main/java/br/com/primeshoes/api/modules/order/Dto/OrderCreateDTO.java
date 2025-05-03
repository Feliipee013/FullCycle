package br.com.primeshoes.api.modules.order.Dto;

import br.com.primeshoes.api.modules.user.Entity.User;
import br.com.primeshoes.api.modules.order.Enum.OrderStatus;
import br.com.primeshoes.api.modules.payment.PaymentMethod;

public record OrderCreateDTO(
		User user,
		float totalPrice,
		OrderStatus status,
		PaymentMethod paymentMethod,
		String trackingCode
		) {}
