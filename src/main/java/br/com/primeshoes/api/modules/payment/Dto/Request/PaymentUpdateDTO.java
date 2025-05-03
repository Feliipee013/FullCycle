package br.com.primeshoes.api.modules.payment.Dto.Request;

import br.com.primeshoes.api.modules.order.Entity.Order;
import br.com.primeshoes.api.modules.payment.Enum.PaymentMethod;
import br.com.primeshoes.api.modules.payment.Enum.PaymentStatus;

public record PaymentUpdateDTO(
		long id,
		Order order,
		float amount,
		PaymentMethod paymentMethod,
		PaymentStatus paymentStatus
		) {}
