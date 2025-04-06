package br.com.primeshoes.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.dtos.AddressCreateDTO;
import br.com.primeshoes.api.dtos.AddressResponseDTO;
import br.com.primeshoes.api.dtos.AddressUpdateDTO;
import br.com.primeshoes.api.entities.Address;
import br.com.primeshoes.api.mappers.AddressMapper;
import br.com.primeshoes.api.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public AddressResponseDTO store(AddressCreateDTO addressCreateDTO) {
		Address address =  AddressMapper.toEntity(addressCreateDTO);
		Address addressResponse = addressRepository.save(address);
		return AddressMapper.toDTO(addressResponse);
	}
	
	public List<AddressResponseDTO> list() {
		return addressRepository.findAll().stream().map(AddressMapper::toDTO).toList();
	}
	
	public AddressResponseDTO show(long id) {
			Address address = addressRepository.findById(id)
					.orElseThrow(()->new RuntimeException("Endereço com id" + id + " não encontrado"));
			return AddressMapper.toDTO(address);
	}
	
	public AddressResponseDTO update(AddressUpdateDTO addressUpdateDTO) {
		Address address = addressRepository.findById(addressUpdateDTO.id()).orElseThrow(()->new RuntimeException("Endereço não encontrado para alteração"));
		address.setStreet(addressUpdateDTO.street());
		address.setNumber(addressUpdateDTO.number());
		address.setNeighborhood(addressUpdateDTO.neighborhood());
		address.setCity(addressUpdateDTO.city());
		address.setState(addressUpdateDTO.state());
		address.setCompliment(addressUpdateDTO.compliment());
		address.setZipCode(addressUpdateDTO.zipcode());
		address.setUser(addressUpdateDTO.user());
		
		return AddressMapper.toDTO(addressRepository.save(address));
	}
	
	public void destroy(long id) {
		Address address = addressRepository.findById(id).orElseThrow(()->new RuntimeException("Endereço não encontrado para deleção"));
		addressRepository.delete(address);
	}
}
