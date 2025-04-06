package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.AddressCreateDTO;
import br.com.primeshoes.api.dtos.AddressResponseDTO;
import br.com.primeshoes.api.entities.Address;

public class AddressMapper {
	public static AddressResponseDTO toDTO(Address address) {
		return new AddressResponseDTO(address.getId(), address.getStreet(), address.getNumber(), address.getNeighborhood(), address.getCity(), address.getState(), address.getCompliment(), address.getZipCode(), address.getUser());
	}
	
	public static Address toEntity(AddressCreateDTO addressCreateDTO) {
		Address address = new Address();
		address.setStreet(addressCreateDTO.street());
		address.setNumber(addressCreateDTO.number());
		address.setNeighborhood(addressCreateDTO.neighborhood());
		address.setCity(addressCreateDTO.city());
		address.setState(addressCreateDTO.state());
		address.setCompliment(addressCreateDTO.compliment());
		address.setZipCode(addressCreateDTO.zipcode());
		address.setUser(addressCreateDTO.user());
		
		return address;
	}
}
