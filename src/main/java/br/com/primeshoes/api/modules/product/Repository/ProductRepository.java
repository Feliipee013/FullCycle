package br.com.primeshoes.api.modules.product.Repository;

import br.com.primeshoes.api.modules.product.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}