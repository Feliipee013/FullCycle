package br.com.primeshoes.api.modules.order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeshoes.api.modules.order.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
