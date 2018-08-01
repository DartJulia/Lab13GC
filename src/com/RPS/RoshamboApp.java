package com.RPS;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Player human = new User();
		Player computer = null;
		Roshambo js = null;
		Roshambo userValue;

		// prompt user to enter name and use Validator class
		String userName = Validator.getString(scan, "Please enter your name: ");
		String cont = "y";
		while (cont.equals("y")) {

			String userChoice = Validator.getString(scan,
					"Would you like to play against TheJets or TheSharks? (j/s)? ");

			String userInput = Validator.getString(scan, "Rock, Paper, or scissors? (R/P/S) ");

			userValue = human.generateRoshambo(userInput);
			System.out.println(userName + ": " + userValue);

			if (userChoice.equalsIgnoreCase("j")) {
				// Creates dummy object, set the name, and generate a roshambo enum, display
				// choice
				computer = new DummyUser();
				computer.setName("TheJets");
				js = computer.generateRoshambo();
				System.out.println(computer.getName() + ": " + js);

			} else if (userChoice.equalsIgnoreCase("s")) {
				// Creates random user object, set the name, and generate a roshambo enum,
				// display choice
				computer = new RandomUser();
				computer.setName("TheSharks");
				js = computer.generateRoshambo();
				System.out.println(computer.getName() + ": " + js);
			}
			// call method to display results
			System.out.println(displayResults(computer, userName, userValue, js));


			cont = Validator.getString(scan, "Play again? (y/n) ");
		}
		System.out.println("Thanks for playing!");
		scan.close();
	}


	public static String displayResults(Player computer, String userName, Roshambo userValue, Roshambo js) {
		// determine the results based on computer pick and human pick


		if (userValue.equals(js)) {
			return "Draw!";
			// list options for if computer user wins
		} else if (userValue.equals(Roshambo.ROCK) && js.equals(Roshambo.PAPER)
				|| userValue.equals(Roshambo.SCISSORS) && js.equals(Roshambo.ROCK)
				|| userValue.equals(Roshambo.PAPER) && js.equals(Roshambo.SCISSORS)) {

			return computer.getName() + " wins!";
			// all other combos returns user as winner
		} else {

			return userName + " wins!";
		}



	}



}
