package br.com.primeshoes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeshoes.api.entities.Address;

@Repository
public interface AdressRepository extends JpaRepository<Address, Long>{

}
