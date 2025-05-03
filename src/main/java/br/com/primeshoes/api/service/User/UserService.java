package br.com.primeshoes.api.service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.dtos.User.UserCreateDTO;
import br.com.primeshoes.api.dtos.User.UserResponseDTO;
import br.com.primeshoes.api.dtos.User.UserUpdateDTO;
import br.com.primeshoes.api.entities.Address.Address;
import br.com.primeshoes.api.entities.User.User;
import br.com.primeshoes.api.mappers.User.UserMapper;
import br.com.primeshoes.api.repository.AddressRepository;
import br.com.primeshoes.api.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AddressRepository adressRepsitory;
	
	public UserResponseDTO store(UserCreateDTO userCreateDTO) {
		User user = UserMapper.toEntity(userCreateDTO);
		User userResponse = userRepository.save(user);
		
		Address adress = new Address();
		adress.setUser(userResponse);
		adressRepsitory.save(adress);
		
		return UserMapper.toDTO(userResponse);
		
	}
	
	public List<UserResponseDTO> list() {
		return userRepository.findAll().stream().map(UserMapper::toDTO).toList();
	}
	
	public UserResponseDTO show(long id) {
		User user = userRepository.findById(id).orElseThrow(
				()->new RuntimeException("Usuário com o id " + id +" não foi encontrado")
			);
		
		return UserMapper.toDTO(user);
	}
	
	public UserResponseDTO update(UserUpdateDTO userUpdateDTO) {
		User user = userRepository
				.findById(userUpdateDTO.id())
				.orElseThrow(() -> new RuntimeException("Usuário não encontrado para alteração"));
		
		user.setName(userUpdateDTO.name());
		user.setEmail(userUpdateDTO.email());
		user.setRole(userUpdateDTO.role());
		user.setPassword(userUpdateDTO.password());
		
		return UserMapper.toDTO(userRepository.save(user));
	}
	
	public void destroy(long id) {
		User user = userRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Usuário não encontrado para deleção"));
		
		userRepository.delete(user);
	}
	
}
