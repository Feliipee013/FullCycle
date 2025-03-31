package br.com.primeshoes.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.service.OrderService;

@RestController
@RequestMapping
public class OrderController {
	
	@Autowired
	OrderService orderService;
}
