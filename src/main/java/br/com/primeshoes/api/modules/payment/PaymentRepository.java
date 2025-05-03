package br.com.primeshoes.api.modules.payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeshoes.api.modules.payment.Payment.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
