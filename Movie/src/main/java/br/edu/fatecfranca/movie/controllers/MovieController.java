package br.edu.fatecfranca.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.movie.dtos.MovieDTO;
import br.edu.fatecfranca.movie.services.MovieService;

@RestController
@RequestMapping(value="movies")
public class MovieController {

	@Autowired
	MovieService injecaoMovie;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable){
		return injecaoMovie.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO find(@PathVariable Long id){
		return injecaoMovie.findById(id);
	}
}
