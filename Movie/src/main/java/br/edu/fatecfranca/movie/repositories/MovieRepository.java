package br.edu.fatecfranca.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.movie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
