package br.edu.fatecfranca.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatecfranca.movie.dtos.MovieDTO;
import br.edu.fatecfranca.movie.dtos.ScoreDTO;
import br.edu.fatecfranca.movie.entities.Movie;
import br.edu.fatecfranca.movie.entities.Score;
import br.edu.fatecfranca.movie.entities.User;
import br.edu.fatecfranca.movie.repositories.MovieRepository;
import br.edu.fatecfranca.movie.repositories.ScoreRepository;
import br.edu.fatecfranca.movie.repositories.UserRepository;

@Service // podemos fazer injeção de dependência 
public class ScoreService {

	@Autowired
	private MovieRepository injecaoMovie;
	
	@Autowired
	private ScoreRepository injecaoScore;
	
	@Autowired
	private UserRepository injecaoUser;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO scoreDTO) {
		User user = injecaoUser.findByEmail(scoreDTO.getEmail());
		if (user == null) { // usuário não existe
			user = new User();
			user.setEmail(scoreDTO.getEmail());
			injecaoUser.saveAndFlush(user);
		}
		// recuperar o filme sendo avaliado
		Movie movie = injecaoMovie.findById(scoreDTO.getMovieId()).get();
		// monta o objeto nota
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(scoreDTO.getScore());
		// salva a nota no banco de dados
		score = injecaoScore.saveAndFlush(score);
		
		// recalcula a média do filme
		float soma = 0;
		for(Score x: movie.getScores()) {
			soma += x.getValue();
		}
		// recalcula a nota do filme
		double media = soma / movie.getScores().size();
		movie.setScore(media);
		// atualiza a qtde de avaliações
		movie.setCount(movie.getScores().size());
		
		movie = injecaoMovie.save(movie);
		
		return new MovieDTO(movie);
	}
	
}
