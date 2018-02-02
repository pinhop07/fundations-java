/**
* This program will test the StateAbbreviation class
**/

import java.util.Scanner;

public class JavaTestDemo
{
	public static void main(String[] args)
	{
		String question;	//to hold state abbreviation

		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);

		//Ask user for state abbreviation
		System.out.println("Who do you love?");
		question = keyboard.nextLine();

		//Create an instance of the StateAbbreviation class
		//and pass the data through the constructor
		JavaTest answer = new JavaTest(question);

		//Get the state that corresponds to its abbreviation
		System.out.println(answer.getQuestion());
	}
}// End

