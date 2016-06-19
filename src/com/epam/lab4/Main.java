package com.epam.lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LongestPlateau plateau = new LongestPlateau();
//		int[] array = { 2, 9, 9, 9, 9, 9, 2, 4, 6, 6, 4, 5, 5, 5, 5, 8, 5, 2, 3, 2, 4, 3 };
//		plateau.calculation(array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please put coordinates x and y and bomb probability");
		Minesweeper minesweeperField = null;
		try{
		int x = sc.nextInt();
		int y = sc.nextInt();
		int p = sc.nextInt();
		minesweeperField = new Minesweeper(x, y, p);
		}catch(InputMismatchException e){
			System.out.println(e +"\n Try again");
		}
		minesweeperField.runGame();
		
			}

}
