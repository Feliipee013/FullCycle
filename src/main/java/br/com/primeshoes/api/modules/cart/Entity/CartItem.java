package br.com.primeshoes.api.modules.cart.Entity;

import br.com.primeshoes.api.modules.product.Entity.ProductVariation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="car_items")
@Data
@AllArgsConstructor
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int quantity;
	private float subtotal;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name="product_variation_id")
	private ProductVariation productVariation;
}
