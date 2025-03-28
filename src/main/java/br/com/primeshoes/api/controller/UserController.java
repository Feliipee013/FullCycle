package br.com.primeshoes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.dtos.UserCreateDTO;
import br.com.primeshoes.api.mappers.UserMapper;
import br.com.primeshoes.api.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserService userService;
	
	
	@PostMapping
	public ResponseEntity<UserCreateDTO> createUser(@RequestBody UserCreateDTO userCreateDTO) {
		UserCreateDTO userResponse = UserMapper.toDTO(userService.store(userCreateDTO));
		return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
	}
	
	
	@GetMapping
	public List<UserCreateDTO> listAll()
	{
		return userService.getAll();
	}
	
	
}
