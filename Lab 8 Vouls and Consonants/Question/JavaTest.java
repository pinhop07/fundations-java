//Paul Pinho Lab 4, October 19, 2009, CISY 105-1X

/**
* For this lab I am creating a StateAbbreviation class
* that will be able to accept in a program the
* abbreviation of a state, and return the name of the
* state that corresponds to it.  The class will contain
* a constructor that will accept the state abbreviation,
* and a getStateAbb that will use an if statement to get
* the state name that corresponds to its abbreviation.
**/

public class JavaTest
{
	private String question;	//To hold the state abbreviation


	public JavaTest(String ques)
	{
		question = ques;
	}


	//The getStateabb returns the states name
	public String getQuestion()
	{

		/**
		* This if statement gets the state that corresponds
		* to its abbreviation. If the abbreviation does not
		* exist an error will occur.
		**/

		if (question.equalsIgnoreCase("Paul"))
		{
			System.out.println(":) I love you too <3");
		}

		else
		{
			System.out.println("Try again");
		}


	}

} //End