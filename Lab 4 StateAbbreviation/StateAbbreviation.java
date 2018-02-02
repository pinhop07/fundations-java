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

public class StateAbbreviation
{
	private String stateAbb;	//To hold the state abbreviation


	public StateAbbreviation(String statabb)
	{
		stateAbb = statabb;
	}


	//The getStateabb returns the states name
	public String getStateAbb()
	{

		/**
		* This if statement gets the state that corresponds
		* to its abbreviation. If the abbreviation does not
		* exist an error will occur.
		**/

		if (stateAbb.equalsIgnoreCase("NC"))
			System.out.println("The state you entered was North Carolina");

		else if (stateAbb.equalsIgnoreCase("SC"))
			System.out.println("The state you entered was South Carolina");

		else if (stateAbb.equalsIgnoreCase("GA"))
			System.out.println("The state you entered was Georgia");

		else if (stateAbb.equalsIgnoreCase("FL"))
			System.out.println("The state you entered was Florida");

		else if (stateAbb.equalsIgnoreCase("AL"))
			System.out.println("The state you entered was Alabama");

		else
			System.out.println("That's not a correct "
								+ "abbreviation, please "
								+ "try again.");

		return stateAbb;

	}
} //End