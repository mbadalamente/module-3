import java.util.*;

public class vendingMachine {
public static void main (String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Welcome to Maddie and Amber's Vending Machine!");
		String[] snacks = {"Doritos", "Pretzels", "M&Ms", "Crackers", "Fruit Snacks", "Cheetos"};
		double[] snackPrices = {0.75, 1.25, 1, 0.25, 0.50, 1};
		System.out.println("Our snack options are: ");
		for(int i= 0; i<snacks.length; i++) {
			System.out.println("A"+i+ ": " + snacks[i] + ", $" + snackPrices[i]);
		System.out.println("What would you like?");
		String snackSelection = Scanner.next();
		System.out.println("Enter your money");
		int amountOfMoney = Scanner.nextInt();
		}
	}
}
