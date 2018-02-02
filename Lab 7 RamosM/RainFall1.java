// RamosM Lab 7

/** Should demonstrate the RainFallClass in a complete program

*/ // Imports
import javax.swing.JOptionPane;

public class RainFall1
{
	public static void main (String[] ars)
	{
		String[] months = { "January", "February", "March",
						  "April", "May", "june", "July",
						  "August", "September", "October",
						  "November", "December" };
		final int ONE_YEAR = 12; // Number of elements

		// Create an array to hold the rainfall amount for a year.
		double[] rainFall = new double[ONE_YEAR];

		// Get the week's rainfall figures.
		getValues(rainFall);

		// Create a RainFallClass object, initialized
		// with the year's rainfall amount.
		RainFallClass year = new RainFallClass(rainFall);

		// Display the total, average, most, and least
		// rainfall amount for the year.
		JOptionPane.showMessageDialog(null,
				  "The total rainfall was " +
				  (year.getTotal()) +
				  "\nThe average monthly rainfall was " +
				  (year.getAverage()) +
				  "\n The most rain was in " +
				  (months[year.getMost()]) +
				  "\n The least rain was in " +
				  (months[year.getLeast()]));

		System.exit(0);
	}

	/**
		The getValues method aks the user to enter rainfall
		amounts for each element of an array.
	*/

	private static void getValues(double[] array)
	{
		String input; // To hold the user input.
		double rain;
		rain = -1;

		// Get the rainfall for each month of the year.
		for (int i = 0; i < array.length; i++)
		{
			rain = -1;
			while (rain < 0)
			{input = JOptionPane.showInputDialog("Enter " +
			"the rain for month " +(i+1) + ".");
			rain = Double.parseDouble(input);}
			array[i] = rain;
		}
	}
}

