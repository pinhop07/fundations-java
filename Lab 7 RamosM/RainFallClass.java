// RamosM Lab 7

/** Write a RainFall class that stores the total rainfal for each
of 12 months into an array of doubles. The program should have
methods that return: The total rainfall for the year,
the average monthly rainfall, the month with the most rain,
and the month with the least rain.
*/

public class RainFallClass
{
	private double [] rainFall; // The rainfall data

	public RainFallClass(double[] ggg)
	{
		// Create an array as large as ggg.
		rainFall = new double[ggg.length];

		// Copy the elements from ggg to rainfall.
		for (int index = 0; index < ggg.length; index++)
			rainFall[index] = ggg[index];
	}

	/** getTotal method
	return the total of the elements in
	the rainfall array.
	*/

	public double getTotal()
	{
		double total = 0.0; // Accumulator

		// Accumulate the sum of the elements
		// in the rainfall array.
		for (int index = 0; index < rainFall.length; index++)
			total += rainFall[index];

			// Return the total.
			return total;
	}

	/**
		getAverage method
		return the average of the elements in the rainfall array.
	*/

	public double getAverage()
	{
		return getTotal() / rainFall.length;
	}

	/**
		getMost method
		return the most value stored in
		the rainfall array.
	*/

	public int getMost()
	{

		int location; // location of most

		location = 0;

		double most = rainFall[0];

		for (int index = 1; index < rainFall.length; index++)
		{
			if (rainFall[index] > most)
			   {most = rainFall[index];
			   location = index;}
	    }

	    return location;
	}

	/**
		getLeast method
		return the least value Stored in the
		rainfall array.
	*/

	public int getLeast()
	{
		int location; // location of least

		location = 0;

		double least = rainFall[0];

		for (int index = 1; index < rainFall.length; index++)
		{
			if (rainFall[index] < least)
			   {least = rainFall[index];
			   location = index;}
	    }

	    return location;
	}


}


