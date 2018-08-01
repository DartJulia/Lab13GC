package com.RPS;

public abstract class Player {
	private String name;
	private Roshambo value;

	public Player() {
		super();
	}

	public Player(String name, Roshambo value) {
		super();
		this.name = name;
		this.value = value;
	}

	public abstract Roshambo generateRoshambo();

	public abstract Roshambo generateRoshambo(String userInput);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getValue() {
		return value;
	}

	public void setValue(Roshambo value) {
		this.value = value;
	}



}
