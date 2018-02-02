/**
*This program tests the RainFall class
**/

import java.util.Scanner;	//Needed for Scanner class

public class RainFallDemo
{
	public static void main (String[] args)
	{
		final int ONE_YEAR = 12;	//Number of array elements

		//Create an array to hold the rain numbers
		//for one year.
		double[]rain = new double[ONE_YEAR];

		//Get the year's rain values and store
		//Them in the rain array.
		getValues(rain);

		//Create a RainFall object initialized with the
		//rain array.
		RainFall year = new RainFall(rain);

		//Display the total, average, most, and least
		//rain amount for the year.
		System.out.println();
		System.out.println("The total rainfall was: "
						   + year.getTotal());
		System.out.println("The average rainfall was: "
						   + year.getAverage());
		System.out.println("The month with the most rain was: "
						   + year.getMost());
		System.out.println("The month with the least rain was: "
						   + year.getLeast());
	}

	/**
	* The following method accepts an array as its
	* argument. The user is asked to enter the rain
	* amounts for each element.
	**/

	private static void getValues(double[] array)
	{
		//A String array to hold the months
		String[] month = {"January", "February", "March",
						  "April", "May", "June", "July",
						  "August", "September", "October",
						  "November", "December" };

		//Create a Scanner object for a keyboard input.
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the rain fall for each "
						   + "of the following months.");

		//Get the rain for each month in the year.
		for (int index = 0; index < array.length; index++)
		{
			System.out.print(month[index] + ": ");
			array[index] = keyboard.nextDouble();
		}
	}

} //End

