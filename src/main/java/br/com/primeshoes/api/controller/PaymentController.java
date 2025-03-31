package br.com.primeshoes.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.service.PaymentService;

@RestController
@RequestMapping
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
}
