package br.com.primeshoes.api.modules.promotion.Entity;

import java.time.Instant;

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
import lombok.NoArgsConstructor;

@Entity
@Table(name="promotions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private float discountPercentage;
	private Instant startDate;
	private Instant endDate;
	private boolean isActive;
	@ManyToOne
	@JoinColumn(name = "product_id_variation")
	private ProductVariation productVariation;
}
