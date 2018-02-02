//Paul Pinho Lab 10 TestScores December 7, 2009, CISY 105 - 1X

/**
*  I am creating a class called TestScores. The class
*  will contain a constructor that accepts an array of
*  test scores as its argument.  The class contains a
*  getAverage method that returns the average of the
*  test scores. The TestScoreDemo class will have a
*  method that will throw an IllegalArgumentException
*  if any test score in the array is negeative or
*  greater than 100.
*/


public class TestScores
{
	double[] testScores;	//References the testScores data

	/**
	*  The constructor accepts an array as an argument.
	*  The elements in the argument array are coppied
	*  to the testScores array.
	*/

	public TestScores(double[] scores)
    {
        //Create a new array the same length as scores.
        testScores = new double[scores.length];

		//Copy the values in r to rain.
        for (int index = 0; index < scores.length; index++)
        testScores[index] = scores[index];
    }

    /**
	*  The getTotal method returns the total of the
	*  elements in the rain array.
	*/

    public double getTotal()
    {
        double total = 0.0;

        for (double value : testScores)
        total += value;

        return total;
    }

    /**
	*  The getAverage method returns the average of the
	*  elements in the testScores array.
	*/

    public double getAverage()
    {
        return getTotal() / testScores.length;
    }

}




