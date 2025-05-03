package br.com.primeshoes.api.modules.payment.Service;

import java.util.List;

import br.com.primeshoes.api.modules.payment.Dto.Request.PaymentCreateDTO;
import br.com.primeshoes.api.modules.payment.Dto.Reponse.PaymentResponseDTO;
import br.com.primeshoes.api.modules.payment.Dto.Request.PaymentUpdateDTO;
import br.com.primeshoes.api.modules.payment.Entity.Payment;
import br.com.primeshoes.api.modules.payment.Mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.modules.payment.Repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	public PaymentResponseDTO store(PaymentCreateDTO paymentCreateDTO) {
		Payment payment = PaymentMapper.toEntity(paymentCreateDTO);
		Payment paymentResponse = paymentRepository.save(payment);
		return PaymentMapper.toDTO(paymentResponse);
	}
	
	public List<PaymentResponseDTO> list() {
		return paymentRepository.findAll().stream().map(PaymentMapper::toDTO).toList();
	}
	
	public PaymentResponseDTO show (long id) {
		Payment payment = paymentRepository.findById(id).
				orElseThrow(() -> new RuntimeException("Pagamento com id " + id + " não foi encontrado"));
		return PaymentMapper.toDTO(payment);
	}
	
	public PaymentResponseDTO update(PaymentUpdateDTO paymentUpdateDTO) {
		Payment payment = paymentRepository.findById(paymentUpdateDTO.id())
				.orElseThrow(() -> new RuntimeException("Pagamento não encontrado"));
		payment.setOrder(paymentUpdateDTO.order());
		payment.setAmount(paymentUpdateDTO.amount());
		payment.setPaymentMethod(paymentUpdateDTO.paymentMethod());
		payment.setPaymentStatus(paymentUpdateDTO.paymentStatus());
		
		return PaymentMapper.toDTO(paymentRepository.save(payment));
	}
	
	public void destroy(long id) {
		Payment payment = paymentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Pagamento não encontrado"));
		paymentRepository.delete(payment);
	}
}
