/**
*  The RainFall class will store the total
* rainfall for each of the 12 months into
* an array of double. It will contain a
* getTotal method that will calculate and
* return the total. A getAverage method that
* will calculate and return the average rainfall
* for the year. A getMost meathod that will
* calculate which month had the most amount
* of rain and then return the value. And a
* getLeast method that will clculate which
* month had the least rainfall and return that
* value.
**/

public class RainFall
{
	private double[] rain; //References the rain data

	/**
	* The constructor accepts an array as an argument.
	* The elements in the argument array are coppied
	* to the rain array.
	**/

	public RainFall(double[] r)
	{
		//Create a new array the same length as r.
		rain = new double[r.length];

		//Copy the values in r to rain.
		for (int index = 0; index < r.length; index++)
			rain[index] = r[index];

	}

	/**
	* The getTotal method returns the total of the
	* elements in the rain array.
	**/

	public double getTotal()
	{
		double total = 0.0;

		for (double value : rain)

		total += value;

		return total;

	}

	/**
	* The getAverage method returns the average of the
	* elements in the rain array.
	**/

	public double getAverage()
	{
		return getTotal() / rain.length;
	}

	/**
	* The getMost method returns the month with the
	* with the most rain stored in the rain array.
	**/

	public int getMost()
	{
		int location; // location of most

		location = 0;

		//Stores the first value in the rain array
		//in the variable most.
		double most = rain[0];

		//Search array for highest value
		for (int index = 1; index < rain.length; index++)
		{
			if (rain[index] > most)
			   {
				   most = rain[index];
				   location = index + 1;
			   }
		}
			//Return location of highest value.
			return location;
		}

	/**
	* The getLeast method returns the month with the
	* with the least rain stored in the rain array.
	**/

	public int getLeast()
	{
		int location; // location of least

		location = 0;

		//Stores the first value in the rain array
		//in the variable least.
		double least = rain[0];

		//Search array for lowest value
		for (int index = 1; index < rain.length; index++)
		{
			if (rain[index] < least)
			{
				least = rain[index];
				location = index +1;
			}
		}
			//Return location of least value.
			return location;
		}
} //End

