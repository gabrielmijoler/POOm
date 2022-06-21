package br.edu.fatecfranca.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.movie.entities.Score;
import br.edu.fatecfranca.movie.entities.ScorePK;

public interface ScoreRepository extends 
			JpaRepository<Score, ScorePK>{

}
