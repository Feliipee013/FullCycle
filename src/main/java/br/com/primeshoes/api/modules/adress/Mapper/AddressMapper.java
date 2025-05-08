package br.com.primeshoes.api.modules.adress.Mapper;

import br.com.primeshoes.api.modules.adress.Dto.Request.AddressCreateDTO;
import br.com.primeshoes.api.modules.adress.Dto.Response.AddressResponseDTO;
import br.com.primeshoes.api.modules.adress.Entity.Address;

public class AddressMapper {
    public static AddressResponseDTO toDTO(Address address) {
        return new AddressResponseDTO(
                address.getId(),
                address.getStreet(),
                address.getNumber(),
                address.getNeighborhood(),
                address.getCity(),
                address.getState(),
                address.getCompliment(),
                address.getZipcode(),
                address.getUser()
        );
    }

    public static Address toEntity(AddressCreateDTO addressCreateDTO) {
        Address address = new Address();
        address.setStreet(addressCreateDTO.street());
        address.setNumber(addressCreateDTO.number());
        address.setNeighborhood(addressCreateDTO.neighborhood());
        address.setCity(addressCreateDTO.city());
        address.setState(addressCreateDTO.state());
        address.setCompliment(addressCreateDTO.compliment());
        address.setZipcode(addressCreateDTO.zipcode());
        address.setUser(addressCreateDTO.user());

        return address;
    }
}
