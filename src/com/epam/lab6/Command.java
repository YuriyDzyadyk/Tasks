package com.epam.lab6;

public enum Command {

	START_GAME(1, "Create a Table"), OPEN(2, "Open"), CREATE(3, "List All Records"), DELETE(4,
			"Delete a Record"), MAKE_CHOICE1(5, "List All Tables"), MAKE_CHOICE2(6, "Delete a Table"), MAKE_CHOICE3(7,
					"Insert a Record"), EXIT(0, "Exit");

	private final String message;
	private final int code;

	private Command(int code, String message) {
		this.message = message;
		this.code = code;
	}

	public static Command get(int code) {
		for (Command c : Command.values()) {
			if (code == c.code) {
				return c;
			}
		}
		return null;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
