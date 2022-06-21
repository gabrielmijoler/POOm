package br.edu.fatecfranca.apidb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.apidb.model.Pokemon;

// a classe interface vai herdar todos os métodos de CRUD do JpaRepository
// os métodos CRUD são de inserção, remoção, atualização e consulta
// os métodos funcionarão especificamente para a classe Pokemon
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
	// implicitamente, temos todos os métodos de banco de dados
	// com a classe Pokemon
}
