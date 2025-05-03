package br.com.primeshoes.api.modules.payment.Payment;

import java.time.Instant;

import br.com.primeshoes.api.modules.order.Entity.Order;
import br.com.primeshoes.api.modules.payment.PaymentMethod;
import br.com.primeshoes.api.modules.payment.PaymentStatus;

public record PaymentResponseDTO(
		long id,
		Order order,
		float amount,
		PaymentMethod paymentMethod,
		PaymentStatus paymentStatus,
		Instant created_at,
		Instant updated_at
		) {}
