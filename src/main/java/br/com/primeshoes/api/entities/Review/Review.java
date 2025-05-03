package br.com.primeshoes.api.entities.Review;

import java.time.Instant;

import br.com.primeshoes.api.entities.Product.ProductVariation;
import br.com.primeshoes.api.entities.User.User;
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
@Table(name="reviews")
@Data
@AllArgsConstructor
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
