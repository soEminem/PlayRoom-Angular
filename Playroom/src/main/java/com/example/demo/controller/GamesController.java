package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Games;
import com.example.demo.service.GamesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GamesController {
	@Autowired
    private GamesService gamesService;
 
    @GetMapping("/getAllGames")
    public List<Games> getAllCourses() {
 
        return gamesService.getAllGames();
    }
 
    @PostMapping("/addNewGame")
    public void addNewGame(@RequestBody Games game) {
        gamesService.saveGame(game);
    }
 
    @DeleteMapping("/deleteGame/{id}")
    public void deleteGame(@PathVariable("id") Long id) {
        gamesService.deleteGame(id);
    }
 
    @PutMapping("/updateGame/{id}")
    public void updateGame(@PathVariable("id") Long id, @RequestBody Games game) {
        gamesService.update(id, game);
    }
}
