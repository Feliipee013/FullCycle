package br.com.primeshoes.api.modules.user.Mapper;

import br.com.primeshoes.api.modules.user.Dto.UserCreateDTO;
import br.com.primeshoes.api.modules.user.Dto.UserResponseDTO;
import br.com.primeshoes.api.modules.user.Entity.User;

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
