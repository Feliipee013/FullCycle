package br.com.primeshoes.api.modules.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeshoes.api.modules.review.Entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

}
