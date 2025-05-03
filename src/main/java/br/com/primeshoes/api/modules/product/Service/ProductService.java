package br.com.primeshoes.api.modules.product.Service;

import java.util.List;

import br.com.primeshoes.api.modules.product.Dto.ProductCreateDTO;
import br.com.primeshoes.api.modules.product.Dto.ProductResponseDTO;
import br.com.primeshoes.api.modules.product.Dto.ProductUpdateDTO;
import br.com.primeshoes.api.modules.product.Entity.Product;
import br.com.primeshoes.api.modules.product.Mapper.ProductMapper;
import br.com.primeshoes.api.modules.product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public ProductResponseDTO store(ProductCreateDTO ProductCreateDTO) {
		Product product = ProductMapper.toEntity(ProductCreateDTO);
		Product productResponse = productRepository.save(product);
		return ProductMapper.toDTO(productResponse);
	}

	public List<ProductResponseDTO> list() {
		return productRepository.findAll().stream().map(ProductMapper::toDTO).toList();
	}

	public ProductResponseDTO update(ProductUpdateDTO productUpdateDTO) {
		Product product = productRepository.findById(productUpdateDTO.id())
				.orElseThrow(() -> new RuntimeException("Produto não encontrado para alteração"));

		product.setName(productUpdateDTO.name());
		product.setDescription(productUpdateDTO.description());
		product.setPrice(productUpdateDTO.price());
		product.setCategory(productUpdateDTO.category());
		product.setBrand(productUpdateDTO.brand());
		product.setImageUrl(productUpdateDTO.imageUrl());
		product.setRating(productUpdateDTO.rating());

		productRepository.save(product);
		return ProductMapper.toDTO(product);
	}

	public ProductResponseDTO show(long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Produto com id " + id + " não foi encontrado"));
		return ProductMapper.toDTO(product);
	}

	public void destroy(long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Produto não encontrado para deleção"));
		productRepository.delete(product);
	}

}
