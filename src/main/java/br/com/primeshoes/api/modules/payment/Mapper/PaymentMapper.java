package br.com.primeshoes.api.modules.payment.Mapper;

import br.com.primeshoes.api.modules.payment.Dto.Request.PaymentCreateDTO;
import br.com.primeshoes.api.modules.payment.Dto.Reponse.PaymentResponseDTO;
import br.com.primeshoes.api.modules.payment.Entity.Payment;

public class PaymentMapper {
	public static PaymentResponseDTO toDTO (Payment payment) {
		return new PaymentResponseDTO(
				payment.getId(),
				payment.getOrder(),
				payment.getAmount(),
				payment.getPaymentMethod(),
				payment.getPaymentStatus(),
				payment.getCreated_at(),
				payment.getUpdated_at()
		);
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
