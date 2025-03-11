package br.com.primeshoes.api.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.primeshoes.api.entites.Product;
import br.com.primeshoes.api.repository.ProductRepository;

public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public void store(Product product) {
		productRepository.save(product);
	}
}
