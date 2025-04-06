package br.com.primeshoes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.dtos.AddressCreateDTO;
import br.com.primeshoes.api.dtos.AddressResponseDTO;
import br.com.primeshoes.api.dtos.AddressUpdateDTO;
import br.com.primeshoes.api.service.AddressService;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping
	public ResponseEntity<AddressResponseDTO> store(@RequestBody AddressCreateDTO addressCreateDTO) {
		return new ResponseEntity<>(addressService.store(addressCreateDTO), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<AddressResponseDTO>> list() {
		return new ResponseEntity<>(addressService.list(),HttpStatus.OK);
	}
	
	@GetMapping("/{id_address}")
	public ResponseEntity<AddressResponseDTO> show(@PathVariable long id_address) {
		try {
			return new ResponseEntity<>(addressService.show(id_address), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PatchMapping
	public ResponseEntity<AddressResponseDTO> update(@RequestBody AddressUpdateDTO addressUpdateDTO) {
		try {
			return new ResponseEntity<>(addressService.update(addressUpdateDTO), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id_address}")
	public ResponseEntity<String> destroy(@PathVariable long id_address) {
		try {
			addressService.destroy(id_address);
			return new ResponseEntity<>("Endereço deletado com sucesso", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
