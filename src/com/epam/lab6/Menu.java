package com.epam.lab6;

public class Menu {

	public void displayChoiceList() {
		System.out.println("Enter your choice:");
		for (Command c : Command.values()) {
			System.out.println(c.getCode() + " " + c);
		}

	}

	public void runCommand(int choice) {
		Command command = Command.get(choice);
		System.out.println("You Chose '" + command.getMessage() + "'\n\n");
		switch (command) {
		case START_GAME: {
			System.out.println("Do start");
			break;
		}
		case OPEN: {
			System.out.println("Do open");
			break;
		}
		case CREATE: {
			System.out.println("Do create");
			break;
		}
		case DELETE: {
			System.out.println("Do delete");
			break;
		}
		case MAKE_CHOICE1: {
			System.out.println("Do choice 1");
			break;
		}
		case MAKE_CHOICE2: {
			System.out.println("Do choice 2");
			break;
		}
		case MAKE_CHOICE3: {
			System.out.println("Do choice 3");
			break;
		}
		case EXIT: {
			System.exit(0);
			break;
		}
		}
	}

}
