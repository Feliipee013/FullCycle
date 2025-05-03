package br.com.primeshoes.api.modules.payment.Payment;

import br.com.primeshoes.api.modules.order.Entity.Order;
import br.com.primeshoes.api.modules.payment.PaymentMethod;
import br.com.primeshoes.api.modules.payment.PaymentStatus;

public record PaymentCreateDTO(
		Order order,
		float amount,
		PaymentMethod paymentMethod,
		PaymentStatus paymentStatus
		) {}
