package br.edu.fatecfranca.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.movie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
