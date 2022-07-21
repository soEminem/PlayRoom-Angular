package com.example.demo.enumeration;

public enum Plan {
	Monthly("Monthly"), SixMonthly("SixMonthly"), Annual("Annual");

	private final String sub;

	// private enum constructor
	private Plan(String sub) {
		this.sub = sub;
	}

	public String getSub() {
		return sub;
	}
}
