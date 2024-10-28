package makechange;

import java.util.Scanner;

public class RegiBlingBling {

	public static void main(String[] args) {
		// TODO make project
		Scanner sc = new Scanner(System.in);

		// cost of item
		System.out.println("Please enter in how much your item costs: ");
		double charge = sc.nextDouble();
		System.out.println("Amount: $" + charge);

		// amount payed with
		System.out.println("How much will you be paying with today?");
		double tendered = sc.nextDouble();
		System.out.println("Tendered: $" + tendered);

		// finding difference
		int difference = (int) diff(charge, tendered);

		// change to an actual amount with no repeating numbers
		double changeActual = (double) difference / 100;

		sc.nextLine();

		// find out if enough money was tendered
		if (charge > tendered) {
			System.out.println("You do not have enough money to buy this!");
		} else {
			// call for change in denominations and prints out
			denomChange(difference);
			System.out.println("your change is $" + changeActual + ".");
		}
		sc.close();
	}

	// note to self: if you sub two doubles it will make a rep decimal, mult into
	// whole before sub for exact #
	public static double diff(double charge, double tendered) {
		int difference;
		double sudodiff = tendered * 100 - charge * 100;
		difference = (int) sudodiff;
		return difference;
	}

	public static int denomChange(int input) {

		// subsequently subtracting from original input and obtaining denominations
		int twenties = input / 2000;
		input = input % 2000;

		int tens = input / 1000;
		input = input % 1000;

		int fives = input / 500;
		input = input % 500;

		int ones = input / 100;
		input = input % 100;

		int quarters = input / 25;
		input = input % 25;

		int dimes = input / 10;
		input = input % 10;

		int nickels = input / 5;
		input = input % 5;

		int pennys = input;

		// inputs ints from above and prints out correct descriptions according to
		// denomination quantity

		// i tried to end it here and call in all of the variables into a new method
		// that would sort this out...
		// ...but wasn't able to find a way, is it possible without making 8 different
		// methods that would then...
		// ... go into 8 other methods with if else statements?
		System.out.println("Here is ");
		if (twenties == 1) {
			System.out.print(twenties + " twenty dollar bill, ");
		} else if (twenties > 1 && twenties <= 4) {
			System.out.print(twenties + " twenty dollar bills, ");
		}

		if (tens != 0) {
			System.out.print(tens + " ten dollar bill, ");
		}

		if (fives != 0) {
			System.out.print(fives + " five dollar bill, ");
		}

		if (ones == 1) {
			System.out.print(ones + " one dollar bill, ");
		} else if (ones > 1 && ones <= 4) {
			System.out.print(ones + " one dollar bills, ");
		}

		if (quarters == 1) {
			System.out.print(quarters + " quarter, ");
		} else if (quarters > 1 && quarters < 4) {
			System.out.print(quarters + " quarters, ");
		}

		if (dimes == 1) {
			System.out.print(dimes + " dime, ");
		} else if (dimes > 1 && dimes <= 4) {
			System.out.print(dimes + " dimes, ");
		}

		if (nickels != 0) {
			System.out.print(nickels + " nickel, ");
		}

		if (pennys == 1) {
			System.out.print("and one penny, ");
		} else if (pennys > 2 && pennys <= 4) {
			System.out.print(pennys + " pennys, ");
		}
		return input;
	}
}
