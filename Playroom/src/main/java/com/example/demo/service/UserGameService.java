package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserGame;
import com.example.demo.repository.GamesRepo;
import com.example.demo.repository.UserGameRepo;
import com.example.demo.repository.UserRepo;
@Service
public class UserGameService {

    @Autowired
    UserGameRepo userGameRepo;
    @Autowired
    GamesRepo gamesRepo;
    @Autowired
    UserRepo userRepo;
    public void addRent(UserGame userGame) {
        userGameRepo.save(userGame);
    }

    public void updateRent(Long user_id, Long game_id, UserGame userGame) {
        userGame = new UserGame(userGame.getStartDate(), userGame.getEndDate(), userRepo.getReferenceById(user_id), gamesRepo.getReferenceById(game_id));
        userGameRepo.save(userGame);
    }

    public void deleteRent(UserGame userGame) {
        userGameRepo.delete(userGame);
    }

    public UserGame getUserGame(Long user_id, Long game_id) {
        return userGameRepo.getRentByUserIdGameID(user_id, game_id);
    }

    public void getRents() {
        userGameRepo.findAll();
    }
}