package com.example.demo.model;

import javax.persistence.*;

@Entity
public class UserGame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// ATTRIBUTE
	private String startDate;
	private String endDate;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "game_id")
	private Games games;

	// CONSTRUCTOR
	public UserGame(String startDate, String endDate, User user, Games game) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
		this.games = game;
	}

	public UserGame() {
	}

	// GETTER SETTER

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}
}
