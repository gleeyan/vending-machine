import java.util.Scanner; // allows for user input

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		final int PENNIES_PER_DOLLAR = 100;
		final int PENNIES_PER_QUARTER= 25;
		
		// Prompt user
		System.out.print("Enter bill value (1, 5, 10): ");
		int billValue = in.nextInt();
		System.out.print("Enter item price (in pennies): ");
		int itemPrice = in.nextInt();
		
		// calculate change
		int change = PENNIES_PER_DOLLAR * billValue - itemPrice;
		int dollars = change / PENNIES_PER_DOLLAR;
		change = change % PENNIES_PER_DOLLAR;
		int quarters = change / PENNIES_PER_QUARTER;
		
		// Print change
		System.out.printf("Dollars: %d", dollars);
		System.out.println();
		System.out.printf("Quarters: %d", quarters);
		
	}
	}


