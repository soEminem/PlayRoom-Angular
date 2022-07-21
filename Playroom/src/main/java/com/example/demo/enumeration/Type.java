package com.example.demo.enumeration;

public enum Type {
	Video("VideoGame"), Table("TableGame");

	private final String gameType;

	// private enum constructor
	private Type(String gameType) {
		this.gameType = gameType;
	}

	public String getGameType() {
		return gameType;
	}
}
