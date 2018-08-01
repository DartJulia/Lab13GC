package com.RPS;

public class DummyUser extends Player {

	public DummyUser() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	// this user won't provide user input so not useful method
	@Override
	public Roshambo generateRoshambo(String userInput) {
		return null;
	}

}
