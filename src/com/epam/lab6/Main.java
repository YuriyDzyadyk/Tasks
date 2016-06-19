package com.epam.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Level l : Level.values()) {
			System.out.println(l);
		}
		System.out.println(Arrays.toString(Level.values()));

		Menu menu = new Menu();
		int choice = 999;
		while (true) {
			menu.displayChoiceList();
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				choice = sc.nextInt();
			}
			try {
				menu.runCommand(choice);

			} catch (NullPointerException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

}
