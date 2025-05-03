package br.com.primeshoes.api.entities.Order;

import java.sql.Date;

import br.com.primeshoes.api.entities.User.User;
import br.com.primeshoes.api.enums.OrderStatus;
import br.com.primeshoes.api.enums.PaymentMethod;
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

@Entity
@Table(name ="orders")
@Data
@AllArgsConstructor
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
