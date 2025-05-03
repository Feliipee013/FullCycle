package br.com.primeshoes.api.modules.order.Dto;

import java.sql.Date;

import br.com.primeshoes.api.modules.user.Entity.User;
import br.com.primeshoes.api.modules.order.Enum.OrderStatus;
import br.com.primeshoes.api.modules.payment.PaymentMethod;

public record OrderResponseDTO(
		long id,
		User user,
		float totalPrice,
		OrderStatus status,
		PaymentMethod paymentMethod,
		String trackingCode,
		Date created_at,
		Date updated_at
		) {}
