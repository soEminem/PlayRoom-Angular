package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

import com.example.demo.enumeration.Plan;

@Entity
public class Subscription {
	// Attributi
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(mappedBy = "sub", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<User> users;

	private int price;
	private Plan plan;

	// Costruttore
	public Subscription() {
		super();
	}

	public Subscription(int price, Plan plan) {
		super();
		this.price = price;
		this.plan = plan;
	}

	// Get and Set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

}
