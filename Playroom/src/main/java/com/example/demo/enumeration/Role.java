package com.example.demo.enumeration;

public enum Role {

	Admin("Admin"), Customer("Customer");

	private final String userRole;

	// private enum constructor
	private Role(String userRole) {
		this.userRole = userRole;
	}

	public String getUserRole() {
		return userRole;
	}

}
