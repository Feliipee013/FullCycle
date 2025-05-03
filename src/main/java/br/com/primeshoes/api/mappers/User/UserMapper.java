package br.com.primeshoes.api.mappers.User;

import br.com.primeshoes.api.dtos.User.UserCreateDTO;
import br.com.primeshoes.api.dtos.User.UserResponseDTO;
import br.com.primeshoes.api.entities.User.User;

public class UserMapper {
	
	public static UserResponseDTO toDTO(User user) {
		UserResponseDTO userResponse = new UserResponseDTO(user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getRole(),user.getCreated_at(), user.getUpdated_at());
		return userResponse;
	}
	public static User toEntity(UserCreateDTO userCreateDTO) {
		User user = new User();
		user.setName(userCreateDTO.name());
		user.setEmail(userCreateDTO.email());
		user.setPassword(userCreateDTO.password());
		user.setRole(userCreateDTO.role());
		return user;
	}
}
