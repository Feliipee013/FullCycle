package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.UserCreateDTO;
import br.com.primeshoes.api.entites.User;

public class UserMapper {
	
	public static UserCreateDTO toDTO(User user) {
		return new UserCreateDTO(user.getName(), user.getEmail(), user.getPassword());
	}
	public static User toEntity(UserCreateDTO userCreateDTO) {
		User user = new User();
		user.setName(userCreateDTO.name());
		user.setEmail(userCreateDTO.email());
		user.setPassword(userCreateDTO.password());
		
		return user;
	}
}
