package br.com.primeshoes.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.dtos.ProductCreateDTO;
import br.com.primeshoes.api.entites.Product;
import br.com.primeshoes.api.mappers.ProductMapper;
import br.com.primeshoes.api.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * Save new product
	 * @param product
	 */
	public Product store(ProductCreateDTO productCreateDTO) 
	{
		Product product = ProductMapper.toEntity(productCreateDTO);
		return productRepository.save(product);
	}
	
	public List<Product> getAll() 
	{
		return productRepository.findAll();
	}
	

}
