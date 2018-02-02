/**
* This program will test the SoftwareSales class
**/

import java.util.Scanner;
import java.text.DecimalFormat;

public class SoftwareSalesDemo
{
	public static void main(String[] args)
	{
		double unitsSold;  // To hold amount of units sold

		// Create DecimalFormat objects for dollar amount
		// and percentages
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		DecimalFormat percent = new DecimalFormat("#0%");

		// Create Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);

		// Ask user for amount of units sold
		System.out.print("Enter Units Sold: $");
		unitsSold = keyboard.nextDouble();

		// Create an instance of the SoftwareSales
		// class and pass the data through the constructor
		SoftwareSales softwareInfo = new SoftwareSales(unitsSold);

		// Calculate the discount
		System.out.println("Your Discount is:"
		                 + dollar.format(softwareInfo.getDiscount()));

		// Calculate the total cost
		System.out.println("The total cost is: $"
						 + dollar.format(softwareInfo.getCost()));
	}
} //End
