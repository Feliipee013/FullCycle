package br.com.primeshoes.api.repository;
import br.com.primeshoes.api.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
