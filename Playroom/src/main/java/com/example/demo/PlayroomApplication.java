package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.enumeration.Plan;
import com.example.demo.enumeration.Role;
import com.example.demo.enumeration.Type;
import com.example.demo.model.*;
import com.example.demo.repository.*;

@SpringBootApplication
public class PlayroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayroomApplication.class, args);
	}

//@Bean
//public CommandLineRunner runner(UserRepo userRepo, GamesRepo gamesRepo, SubscriptionRepo subRepo,
//		UserGameRepo userGameRepo) {
//	return args -> {
//		// Game creation
//		Games games1 = new Games(18, "GTA V", "Avventura", 1, Type.Video);
//		Games games2 = new Games(8, "Jumanji", "Avventura", 4, Type.Table);
//		Games games3 = new Games(16, "Cluedo", "Crime", 4, Type.Table);
//		Games games4 = new Games(7, "Crash Bandicoot", "Avventura", 1, Type.Video);
//		gamesRepo.save(games1);
//		gamesRepo.save(games2);
//		gamesRepo.save(games3);
//		gamesRepo.save(games4);
//		// Subscription creation
//		Subscription sub1 = new Subscription(10, Plan.Monthly);
//		Subscription sub2 = new Subscription(50, Plan.SixMonthly);
//		Subscription sub3 = new Subscription(100, Plan.Annual);
//		subRepo.save(sub1);
//		subRepo.save(sub2);
//		subRepo.save(sub3);

//		// User creation
//		User user1 = new User("Domenico", "Vitale", "DomVit@gmail.com", "123456", "VTLDMC99", 23, Role.Customer,
//				sub1);
//		User user2 = new User("Luigi", "Di Luca", "LuigiDL@gmail.com", "123456", "DLCLGU99", 23, Role.Customer,
//				sub2);
//		User user3 = new User("Benito", "Abatechechile", "BenAba@gmail.com", "123456", "BTEBNT99", 23, Role.Admin);
//		User user4 = new User("Angelo", "Raucci", "AngRau@gmail.com", "123456", "RCCNGL99", 23, Role.Customer,
//				sub3);
//		userRepo.save(user1);
//		userRepo.save(user2);
//		userRepo.save(user3);
//		userRepo.save(user4);
//		// UserGame creation
//		UserGame userGame1 = new UserGame("21/07/2022", "22/07/2022", user2, games2);
//		UserGame userGame2 = new UserGame("15/06/2022", "17/06/2022", user4, games3);
//		UserGame userGame3 = new UserGame("25/03/2022", "27/03/2022", user1, games3);
//		UserGame userGame4 = new UserGame("04/01/2022", "30/01/2022", user3, games1);
//		userGameRepo.save(userGame1);
//		userGameRepo.save(userGame2);
//		userGameRepo.save(userGame3);
//		userGameRepo.save(userGame4);
//	};
//}

}
