package br.com.primeshoes.api.modules.payment.Dto.Reponse;

import java.time.Instant;

import br.com.primeshoes.api.modules.order.Entity.Order;
import br.com.primeshoes.api.modules.payment.Enum.PaymentMethod;
import br.com.primeshoes.api.modules.payment.Enum.PaymentStatus;

public record PaymentResponseDTO(
		long id,
		Order order,
		float amount,
		PaymentMethod paymentMethod,
		PaymentStatus paymentStatus,
		Instant created_at,
		Instant updated_at
		) {}
