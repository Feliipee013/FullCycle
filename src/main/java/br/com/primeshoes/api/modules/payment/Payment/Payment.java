package br.com.primeshoes.api.modules.payment.Payment;

import java.time.Instant;

import br.com.primeshoes.api.modules.order.Entity.Order;
import br.com.primeshoes.api.modules.payment.PaymentMethod;
import br.com.primeshoes.api.modules.payment.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	private float amount;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	private Instant created_at;
	private Instant updated_at;
}
