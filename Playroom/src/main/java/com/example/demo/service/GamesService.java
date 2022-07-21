package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.demo.model.Games;
import com.example.demo.repository.GamesRepo;
@Service
public class GamesService {
	@Autowired
	private GamesRepo gamesRepo;

	public List<Games> getAllGames() {
		return gamesRepo.findAll();
	}

	public void saveGame(Games game) {
		game = new Games(game.getPegi(), game.getName(), game.getCategory(), game.getNplayer(), game.getType());
		gamesRepo.save(game);
	}

	public void deleteGame(Long id) {
		gamesRepo.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	public void update(Long id, Games game) {
		Games updatedGame = new Games();
		updatedGame = gamesRepo.getById(id);
		updatedGame.setPegi(updatedGame.getPegi());
		updatedGame.setName(updatedGame.getName());
		updatedGame.setCategory(updatedGame.getCategory());
		updatedGame.setType(updatedGame.getType());
		updatedGame.setNplayer(updatedGame.getNplayer());
		updatedGame.setUsergames(updatedGame.getUsergames());
		gamesRepo.save(updatedGame);
	}
}
