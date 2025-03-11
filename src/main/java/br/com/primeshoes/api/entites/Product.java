package br.com.primeshoes.api.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Products")
@Setter
@Getter
public class Product {
	private long id;
	private String name;
	private double price;
	private int stock;
}
