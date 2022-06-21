package br.edu.fatecfranca.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatecfranca.movie.dtos.MovieDTO;
import br.edu.fatecfranca.movie.entities.Movie;
import br.edu.fatecfranca.movie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository injecao;
	
	// retorna todos os filmes
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		Page<Movie> movies = injecao.findAll(pageable);
		// para cada Movie, transforme em MovieDTO
		Page<MovieDTO> moviePages = movies.map(x -> new MovieDTO(x));
		return moviePages;
	}
	
	// retorna todos os filmes
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie movie = injecao.findById(id).get();
		// transforme em MovieDTO
		MovieDTO movieDTO = new MovieDTO(movie); 
		return movieDTO;
	}
	
}
