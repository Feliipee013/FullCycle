package br.com.primeshoes.api.dtos.Order;

import java.sql.Date;

import br.com.primeshoes.api.entities.User.User;
import br.com.primeshoes.api.enums.OrderStatus;
import br.com.primeshoes.api.enums.PaymentMethod;

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
