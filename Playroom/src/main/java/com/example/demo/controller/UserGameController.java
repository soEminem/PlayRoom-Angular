
package com.example.demo.controller;

import com.example.demo.model.UserGame;
import com.example.demo.service.UserGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usergame")
public class UserGameController {
	@Autowired
	UserGameService userGameService;

	@PostMapping("/addRent")
	public void addRent(@RequestBody UserGame userGame) {
		userGameService.addRent(userGame);
	}

	@DeleteMapping("/deleteRent/{userid}/{gameid}")
	public void deleteRent(@PathVariable("userid") Long user_id, @PathVariable("gameid") Long game_id) {
		UserGame userGameToDelete = userGameService.getUserGame(user_id, game_id);
		userGameService.deleteRent(userGameToDelete);
	}

	@GetMapping("/getRents")
	public void getRents() {
		userGameService.getRents();
	}

	@PutMapping("/updateRent/{userid}/{gameid}")
	public void updateRent(@PathVariable("userid") Long user_id, @PathVariable("gameid") Long game_id,
			@RequestBody UserGame userGame) {
		userGameService.updateRent(user_id, game_id, userGame);
	}
}
