package com.epam.lab4;

import java.util.Random;

public class Minesweeper {
	private int x;
	private int y;
	private int probability;

	public Minesweeper(int x, int y, int probability) {
		super();
		this.x = x;
		this.y = y;
		this.probability = probability;
	}

	Random rn = new Random();

	public void runGame() {
		int[][] field = new int[x + 2][y + 2];
		int counter = 0;
		
		// frame
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				field[i][0] = 1;
				field[0][j] = 1;
				field[field.length - 1][j] = 1;
				field[i][field.length - 1] = 1;
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		
		//method puts bombs
		for (int i = 1; i < field.length - 1; i++) {
			for (int j = 1; j < field[i].length - 1; j++) {
				int fillField = rn.nextInt(100);
				if (fillField <= probability) {
					field[i][j] = 9;
					System.out.print("x");
				} else {
					field[i][j] = 0;
					System.out.print(field[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
	//
		for (int i = 1; i < field.length - 1; i++) {
			for (int j = 1; j < field[i].length - 1; j++) {
				if (field[i][j] != 9) {
					if (field[i + 1][j] == 9) {
						field[i][j] = ++counter;
					}
					if (field[i + 1][j + 1] == 9) {
						field[i][j] = ++counter;
					}
					if (field[i + 1][j - 1] == 9) {
						field[i][j] = ++counter;
					}
					if (field[i][j + 1] == 9) {
						field[i][j] = ++counter;
					}
					if (field[i - 1][j] == 9) {
						field[i][j] = ++counter;
					}
					if (field[i][j - 1] == 9) {
						field[i][j] = ++counter;
					}
					if (field[i - 1][j - 1] == 9) {
						field[i][j] = ++counter;
					}
					if (field[i - 1][j + 1] == 9) {
						field[i][j] = ++counter;
					}
					System.out.print(field[i][j]);
					counter = 0;
				} else {
					System.out.print("x");
				}
			}
			System.out.println();
		}

	}

}
