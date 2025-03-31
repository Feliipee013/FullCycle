package br.com.primeshoes.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepository;
}
