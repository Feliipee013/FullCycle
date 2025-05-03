package br.com.primeshoes.api.mappers.Payment;

import br.com.primeshoes.api.dtos.Payment.PaymentCreateDTO;
import br.com.primeshoes.api.dtos.Payment.PaymentResponseDTO;
import br.com.primeshoes.api.entities.Payment.Payment;

public class PaymentMapper {
	public static PaymentResponseDTO toDTO (Payment payment) {
		return new PaymentResponseDTO(payment.getId(), payment.getOrder(), payment.getAmount(), payment.getPaymentMethod(), payment.getPaymentStatus(), payment.getCreated_at(), payment.getUpdated_at());
	}
	
	public static Payment toEntity(PaymentCreateDTO paymentCreateDTO) {
		Payment payment = new Payment();
		payment.setOrder(paymentCreateDTO.order());
		payment.setAmount(paymentCreateDTO.amount());
		payment.setPaymentMethod(paymentCreateDTO.paymentMethod());
		payment.setPaymentStatus(paymentCreateDTO.paymentStatus());
		
		return payment;
	}
}
