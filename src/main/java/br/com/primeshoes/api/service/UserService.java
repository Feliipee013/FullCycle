package br.com.primeshoes.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.dtos.UserCreateDTO;
import br.com.primeshoes.api.entites.User;
import br.com.primeshoes.api.mappers.UserMapper;
import br.com.primeshoes.api.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User store(UserCreateDTO userCreateDTO) {
		User user = UserMapper.toEntity(userCreateDTO);
		return userRepository.save(user);
	}
	
	public List <UserCreateDTO> getAll() {
		return userRepository.findAll().stream().map(UserMapper::toDTO).toList();
	}
}
