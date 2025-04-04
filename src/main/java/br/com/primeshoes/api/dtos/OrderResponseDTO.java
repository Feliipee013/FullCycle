package br.com.primeshoes.api.dtos;

import java.sql.Date;

import br.com.primeshoes.api.entites.User;
import br.com.primeshoes.api.enums.OrderStatus;

public record OrderResponseDTO(
		long id,
		User user,
		float totalPrice,
		OrderStatus status,
		String paymentMethod,
		String trackingCode,
		Date created_at,
		Date updated_at
		) {}
