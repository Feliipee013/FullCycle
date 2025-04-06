package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entities.Order;
import br.com.primeshoes.api.enums.PaymentMethod;
import br.com.primeshoes.api.enums.PaymentStatus;

public record PaymentUpdateDTO(
		long id,
		Order order,
		float amount,
		PaymentMethod paymentMethod,
		PaymentStatus paymentStatus
		) {}
