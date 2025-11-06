package nazario2;
// Xavier Nazario

// Student ID# 2512208
// Program to display change after user input.

// Import Scanner for Input
import java.util.Scanner;

public class ChangeCounter {
	public static void main(String[] args) {

		// Create Scanner object
		Scanner scanner = new Scanner(System.in);

		// Prompt for Total Cost
		System.out.println("Enter the total cost of the purchase:");
		double cost = scanner.nextDouble();

		// Prompt for money given
		System.out.println("Enter the amount of money given to clerk:");
		double amountGiven = scanner.nextDouble();

		// Compute change in Cents, convert and then display
		int changeCents = (int) Math.round((amountGiven - cost) * 100);

		// Dollars
		int dollars = changeCents / 100;
		changeCents %= 100;
		// Quarters
		int quarters = changeCents / 25;
		changeCents %= 25;
		// Dimes
		int dimes = changeCents / 10;
		changeCents %= 10;
		// Nickels
		int nickels = changeCents / 5;
		changeCents %= 5;
		// Pennies
		int pennies = changeCents;

		// Print results
		System.out.println("Change returned -");
		System.out.println("Dollars " + dollars);
		System.out.println("Quarters " + quarters);
		System.out.println("Dimes " + dimes);
		System.out.println("Nickels " + nickels);
		System.out.println("Pennies " + pennies);
	}

}
