package br.com.primeshoes.api.dtos.Payment;

import java.time.Instant;

import br.com.primeshoes.api.entities.Order.Order;
import br.com.primeshoes.api.enums.PaymentMethod;
import br.com.primeshoes.api.enums.PaymentStatus;

public record PaymentResponseDTO(
		long id,
		Order order,
		float amount,
		PaymentMethod paymentMethod,
		PaymentStatus paymentStatus,
		Instant created_at,
		Instant updated_at
		) {}
