package br.com.primeshoes.api.dtos.Payment;

import br.com.primeshoes.api.entities.Order.Order;
import br.com.primeshoes.api.enums.PaymentMethod;
import br.com.primeshoes.api.enums.PaymentStatus;

public record PaymentCreateDTO(
		Order order,
		float amount,
		PaymentMethod paymentMethod,
		PaymentStatus paymentStatus
		) {}
