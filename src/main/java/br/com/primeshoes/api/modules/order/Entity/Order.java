package br.com.primeshoes.api.modules.order.Entity;

import java.sql.Date;

import br.com.primeshoes.api.modules.user.Entity.User;
import br.com.primeshoes.api.modules.order.Enum.OrderStatus;
import br.com.primeshoes.api.modules.payment.Enum.PaymentMethod;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	private float totalPrice;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	private PaymentMethod paymentMethod;
	private String trackingCode;
	private Date created_at;
	private Date updated_at;
}
