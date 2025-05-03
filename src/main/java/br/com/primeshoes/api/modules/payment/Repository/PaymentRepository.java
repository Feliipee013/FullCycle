package br.com.primeshoes.api.modules.payment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeshoes.api.modules.payment.Entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
