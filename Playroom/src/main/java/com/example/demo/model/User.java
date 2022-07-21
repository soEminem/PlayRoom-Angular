package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

import com.example.demo.enumeration.Role;

@Entity
public class User {
	// Attributi
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String Cf;
	private int age;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "subscription_id", nullable = false)
	private Subscription sub;

	@OneToMany(mappedBy = "user")
	private List<UserGame> games;

	private Role role;

	// Costruttore
	public User() {
	}

	public User(String name, String surname, String email, String password, String cf, int age, Role role,
			Subscription sub) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.Cf = cf;
		this.age = age;
		this.role = role;
		this.sub = sub;
	}

	public User(String name, String surname, String email, String password, String cf, int age, Role role) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.Cf = cf;
		this.age = age;
		this.role = role;
	}

	// Get and Set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCf() {
		return Cf;
	}

	public void setCf(String cf) {
		this.Cf = cf;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Subscription getSub() {
		return sub;
	}

	public void setSub(Subscription sub) {
		this.sub = sub;
	}

	public List<UserGame> getGames() {
		return games;
	}

	public void setGames(List<UserGame> games) {
		this.games = games;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
