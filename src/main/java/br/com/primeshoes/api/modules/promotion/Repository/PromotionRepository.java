package br.com.primeshoes.api.modules.promotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeshoes.api.modules.promotion.Entity.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long>{

}
