import java.util.*;

public class vendingMachine {
public static void main (String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Welcome to Maddie and Amber's Vending Machine!");
		String[] snacks = {"Doritos", "Pretzels", "M&Ms", "Crackers", "Fruit Snacks", "Cheetos"};
		double[] snackPrices = {0.75, 1.25, 1, 0.25, 0.50, 1};
		System.out.println("Our snack options are: ");
		for(int i= 0; i<snacks.length; i++) {
			System.out.println(i+ ": " + snacks[i] + ", $" + snackPrices[i]);
		}
		System.out.println("Enter the number of the snack you would like.");
		int snackSelection = myScanner.nextInt();
		System.out.println("How many $1 bills would you like to enter?");
		double amountOfMoney = myScanner.nextDouble();
		double difference = amountOfMoney - snackPrices[snackSelection];
		if(difference < 0) {
			System.out.println("Booo not enough money :( try again later");
		}
		else
			System.out.println("Your change is: $" + difference);
		System.out.println("Thank you for stopping at our vending machine! We appreciate you and hope you have a great day! Come back soon!");
	}
}
