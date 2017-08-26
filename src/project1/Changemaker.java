package project1;

import java.util.Scanner;

public class Changemaker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the change you want from 1 to 99.");
		int userInput = scanner.nextInt();
		scanner.close();
		int initial = userInput;
		int quarters = userInput / 25;
		userInput = userInput % 25;
		int dimes = userInput / 10;
		userInput = userInput % 10;
		int nickels = userInput / 5;
		userInput = userInput % 5;
		int pennies = userInput;
		
		
		
		
		System.out.println("Your change from " + initial + " is " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies.");
		
		
		
		
		
	}
		
	

}
