package me.ryan.calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); //creates new Scanner named scanner, records input
		double fnum, snum, answer = 0; //defines variables
		int action; //Action to do to the numbers
		System.out.println("Enter first Number: ");
		fnum = scanner.nextDouble(); //gets input and stores it to fnum
		System.out.println("Enter second Number :");
		snum = scanner.nextDouble(); // stores second number as snum
		System.out.println("Would you like to Multiply (1) Divide (2) Add (3) or Subtract (4) ?");
		action = scanner.nextInt(); //action == next Integer entered
		if (action == 1) {
			answer = fnum * snum; //multiplication
		} else if (action == 2) {
			if (snum == 0) {
				System.out.println("Cannot divide by 0."); // checks to see if dividing by zero, and if not, stores answer
				}
			else answer = fnum / snum; //division
		} else if (action == 3) {
			answer = fnum + snum; //addition
		} else if (action == 3) {
			answer = fnum - snum; //subtraction
		}
		
		System.out.println(answer); //displays answer
		
	}
}
