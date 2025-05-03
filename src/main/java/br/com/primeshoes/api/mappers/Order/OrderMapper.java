package br.com.primeshoes.api.mappers.Order;

import br.com.primeshoes.api.dtos.Order.OrderCreateDTO;
import br.com.primeshoes.api.dtos.Order.OrderResponseDTO;
import br.com.primeshoes.api.entities.Order.Order;

public class OrderMapper {
	
	public static OrderResponseDTO toDTO(Order order) {
		OrderResponseDTO orderResponse = new OrderResponseDTO(order.getId(), order.getUser(), order.getTotalPrice(), order.getStatus(), order.getPaymentMethod(), order.getTrackingCode(), order.getCreated_at(), order.getUpdated_at());
		return orderResponse;
	}
	
	public static Order toEntity(OrderCreateDTO orderCreateDTO) {
		Order order = new Order();
		order.setUser(orderCreateDTO.user());
		order.setTotalPrice(orderCreateDTO.totalPrice());
		
		return order;
	}
}
