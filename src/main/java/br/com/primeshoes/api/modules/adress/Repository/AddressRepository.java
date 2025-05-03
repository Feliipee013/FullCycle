package br.com.primeshoes.api.modules.adress.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeshoes.api.modules.adress.Entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
