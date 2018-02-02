/**
* This program will test the Essay class.
*/

import java.util.Scanner;

public class EssayDemo
{
	public static void main(String[] args)
	{
		int points,		//Number of points essay is worth
			missed;		//Number of points missed

		//Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		//Get the number of points the essay is worth
		System.out.print("How many points is the essay worth? ");
		points = keyboard.nextInt();

		//Get the number of points the student missed
		System.out.print("How many points did the student miss? ");
		missed = keyboard.nextInt();

		//Create an Essay object
		Essay e = new Essay(points, missed);

		//Display the amount of spelling points
		System.out.println("The spelling counts for " +
							e.getSpellingPointsEach() +
							"points");

		//Display the amount of grammer points
		System.out.println("The grammer counts for " +
							e.getGrammarPointsEach() +
							"points");

		//Display the amount of points for correct length
		System.out.println("The correct length counts for " +
							e.getCorrectLengthPointsEach() +
							"points");

		//Display the amount of content points
		System.out.println("The content counts for " +
							e.getContentPointsEach() +
							"points");

		//Display the score on the essay
		System.out.println("The essay score is " + e.getScore());

		//Display the grade on the essay
		System.out.println("The essay grade is " + e.getGrade());
	}

} //End