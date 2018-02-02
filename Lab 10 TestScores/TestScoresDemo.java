/**
*  This program tests the TestScore class
*/

import java.util.Scanner;	//Needed for Scanner class

public class TestScoresDemo
{
    public static void main(String[] args)
    {

        final int TEST_SCORE = 3;	//Number of array elements

        //Create an array to hold the test score data
        double[] scores1 = new double[TEST_SCORE];

        //Get the students test score values and store
		//them in the scores1 array.
        getValues(scores1);

		//Create a TestScores object initialized with the
		//scores1 array.
        TestScores test = new TestScores(scores1);

		//Display the average of the test scores.
        System.out.println("The average of the test scores is: "
        				   + test.getAverage());

	}

	/**
	*  The following method accepts an array as its
	*  argument. The user is asked to enter the rain
	*  amounts for each element.
	*/

	private static void getValues(double[] array)
    {

		double input;	// Create a Scanner object for the input

        //Create a Scanner object for a keyboard input.
        Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the test scores: ");

        //Get the test scores for each test.
        for (int index = 0; index < array.length; index++)
        {

			System.out.print("Enter test scores " + (index + 1) + ". ");

            input = keyboard.nextDouble();

            array[index] = input;

        	if (input < 0 || input > 100)
        	{
				throw new IllegalArgumentException();
        	}

			//Try to asign a negative number to the
			//input field
			try
        	{
				double tests[] = new double[150];
        	}

        	catch (IllegalArgumentException e)
        	{
				System.out.println("Illegal Argument Exception" +
        	    				   " scores must be between 0 and 100");
        	}

		}

	}

} //End




