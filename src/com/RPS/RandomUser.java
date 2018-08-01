package com.RPS;

public class RandomUser extends Player {
	public RandomUser() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
		// random method returns double so need to cast to int
		// need to produce numbers 1-3 so *3+1
		int randNum = (int) Math.random() * 3 + 1;
		if (randNum == 1) {
			return Roshambo.ROCK;
		} else if (randNum == 2) {
			return Roshambo.PAPER;
		} else if (randNum == 3) {
			return Roshambo.SCISSORS;
		}
		return null;
	}

	// not useful for random user
	@Override
	public Roshambo generateRoshambo(String userInput) {
		// TODO Auto-generated method stub
		return null;
	}

}
