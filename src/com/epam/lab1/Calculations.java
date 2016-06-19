package com.epam.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {

	private int OddSum = 0;
	private int EvenSum = 0;
	private int FiboCount = 0;
	private int OddFiboCount;
	private int FirstNumber;
	private int SecondNumber;
	private Scanner sc;
	public void scanNumbers() {
		try{
		System.out.println("Please enter first numbers which your whant proceed ");
		sc = new Scanner(System.in);
		FirstNumber = sc.nextInt();
		System.out.println("Please enter second numbers which your whant proceed ");
		sc = new Scanner(System.in);
		SecondNumber = sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Please enter the NUMBERS");
			scanNumbers();
		}
		if (FirstNumber > SecondNumber) {
			System.out.println("First number should be smaller then second");
			scanNumbers();
		}
	}

	public void showOddAndEven() {

		for (int l = FirstNumber; l <= SecondNumber; l++) {
			if (l % 2 == 0) {
				OddSum = l + OddSum;
				System.out.print(l + " ");
			}
		}
		System.out.println();
		for (int l = SecondNumber; l >= FirstNumber; l--) {
			if (l % 2 != 0) {
				EvenSum = l + EvenSum;
				System.out.print(l + " ");
			}
		}

		printSums();

	}

	private void printSums() {
		System.out.println("\n sum of odd - " + OddSum + "; Sum of even - " + EvenSum);
	}

	public void showFiboOrder() {

		int f1;
		int f2;
		int fibo;

		System.out.println("Now please put quantity of fibonacci you want");
		while(FiboCount==0){
		try{
		sc = new Scanner(System.in);
		FiboCount = sc.nextInt();
		}catch(Exception e){
			System.err.println(e + "\nIt shuld be a number");
			}
		}
		int counter = 1;
		if (SecondNumber % 2 != 0) {
			f1 = SecondNumber;
		} else {
			f1 = SecondNumber - 1;
		}
		f2 = f1 - 1;
		fibo = f1 - f2;
		do {
			if (counter <= FiboCount) {
				System.out.println(f1);
				counter++;
				if (f1 % 2 == 0) {
					OddFiboCount++;
				}
			} else {
				break;
			}
			if (counter <= FiboCount) {
				System.out.println(f2);
				counter++;
				if (f2 % 2 == 0) {
					OddFiboCount++;
				}
			} else {
				break;
			}
			if (counter <= FiboCount) {
				System.out.println(fibo);
				counter++;
				if (fibo % 2 == 0) {
					OddFiboCount++;
				}
			} else {
				break;
			}
			f1 = fibo - Math.abs(f2);
			f2 = f1 - Math.abs(fibo);
			fibo = f2 - Math.abs(f1);
		} while (counter <= FiboCount);
		printFiboPersentage();

	}

	private void printFiboPersentage() {
		System.out.println("Percentage of Odd fibo is " + OddFiboCount * 100 / FiboCount
				+ " and Percentage of Even fibo - " + (FiboCount - OddFiboCount) * 100 / FiboCount);

	}

}
