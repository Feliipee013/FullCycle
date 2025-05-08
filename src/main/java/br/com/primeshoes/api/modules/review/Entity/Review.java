package br.com.primeshoes.api.modules.review.Entity;

import java.time.Instant;

import br.com.primeshoes.api.modules.product.Entity.ProductVariation;
import br.com.primeshoes.api.modules.user.Entity.User;
import jakarta.persistence.Entity;
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
@Table(name="reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int rating;
	private String comment;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="product_variation_id")
	private ProductVariation productVariation;
	
	private Instant created_at;
	private Instant updated_at;
}
