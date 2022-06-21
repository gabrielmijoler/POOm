package br.edu.fatecfranca.apidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.apidb.model.Pokemon;
import br.edu.fatecfranca.apidb.model.repositories.PokemonRepository;

@RestController
public class PokemonController {

	// vamos criar um objeto que usufrui da injeção de
	// dependência, pois objeto usa métodos sem instanciá-lo
	@Autowired
	PokemonRepository injecao;
	
	
	// lista os pokemons cadastrados no banco de dados
	@GetMapping("/pokemon")
	public List<Pokemon> get(){
		return injecao.findAll();
	}
	
	@PostMapping("/pokemon")
	public Pokemon add(@RequestBody Pokemon pokemon) {
		Pokemon novo = injecao.save(pokemon);
		return novo;
		
	}
	
	@DeleteMapping("/pokemon/{id}")
	public String remove(@PathVariable Long id) {
		try {
			injecao.deleteById(id);
			return "Remoção realizada com sucesso";
		}
		catch(Exception e) {
			return "Nada para remover";
		}
	}
	
	@PutMapping("/pokemon")
	public Pokemon put(@RequestBody Pokemon pokemon) {
		Pokemon atual = injecao.save(pokemon); // como o pokemon tem id, o save atualiza
		return atual;
	}
	
}
