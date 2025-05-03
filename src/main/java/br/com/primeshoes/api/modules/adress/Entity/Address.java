package br.com.primeshoes.api.modules.adress.Entity;

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
@Table(name="addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String street;
	private String number;
	private String neighborhood;
	private String city;
	private String state;
	private String compliment;
	private long zipcode;
	@ManyToOne
	@JoinColumn(name ="user_id")
	private User user;
	
}
