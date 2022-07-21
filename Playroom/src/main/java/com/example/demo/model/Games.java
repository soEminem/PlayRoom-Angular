package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

import com.example.demo.enumeration.Type;


@Entity
public class Games {
	// Attributi
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int pegi;
	private String name;
	private String category;
	private int nplayer;

	@OneToMany(mappedBy = "games")
	private List<UserGame> user;

	private Type type;

	public Games(int pegi, String name, String category, int nplayer, Type type) {
		this.pegi = pegi;
		this.name = name;
		this.category = category;
		this.nplayer = nplayer;
		this.type = type;
	}

	public List<UserGame> getUsergames() {
		return user;
	}

	public void setUsergames(List<UserGame> usergames) {
		this.user= usergames;
	}

	public Games() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPegi() {
		return pegi;
	}

	public void setPegi(int pegi) {
		this.pegi = pegi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNplayer() {
		return nplayer;
	}

	public void setNplayer(int nplayer) {
		this.nplayer = nplayer;
	}

	public List<UserGame> getUser() {
		return user;
	}



	public void setUser(List<UserGame> user) {
		this.user = user;
	}



	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
