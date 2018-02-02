/**
* This program will test the StateAbbreviation class
**/

import java.util.Scanner;

public class StateAbbreviationDemo
{
	public static void main(String[] args)
	{
		String stateAbb;	//to hold state abbreviation

		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);

		//Ask user for state abbreviation
		System.out.println("Enter State Abbreviation:");
		stateAbb = keyboard.nextLine();

		//Create an instance of the StateAbbreviation class
		//and pass the data through the constructor
		StateAbbreviation state = new StateAbbreviation(stateAbb);

		//Get the state that corresponds to its abbreviation
		System.out.println(state.getStateAbb());
	}
}// End

