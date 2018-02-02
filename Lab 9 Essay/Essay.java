//Paul Pinho December 1, 2009, CISY 105 - 1X

/**
* The Essay class will inherit the
* methods from the GradedActivity class.
* This class will be used to determine
* the grade a student receives on an
* essay. If the score is a fraction .5
* or greater it will be rounded up to
* the next whole number.
*/

public class Essay extends GradedActivity
{
	private int numPoints;					//Number of points
	private double grammarPointsEach;		//Grammer points
	private double spellingPointsEach;		//Spelling points
	private double correctLengthPointsEach;	//Correct Length points
	private double contentPointsEach;		//Content points
	private int numMissed;					//Number of points missed

	/**
	* The constructor accepts as arguments
	* the number of points on the essay and
	* the number of points the student missed.
	*/

	public Essay(int points,int missed)
	{
		double numericScore;	//To hold the numeric score

		//Set the numPoints and numMissed fields
		numPoints = points;
		numMissed = missed;

		//Set grammer points to 30
		grammarPointsEach = 30.0;

		//Set spelling points to 20
		spellingPointsEach = 20.0;

		//Set correct length points to 20
		correctLengthPointsEach = 20.0;

		//Set content points to 30
		contentPointsEach = 30.0;

		//Calculate the numeric score for this exam
		numericScore = 100.0 - (missed *
					   ((grammarPointsEach
					   + spellingPointsEach
					   + correctLengthPointsEach
					   + contentPointsEach)
					   / points));

		//Call the super class's setScore method to
		//set the numeric score.
		setScore(numericScore);
		adjustScore();

	}

	//This method returns the grammer points
	public double getGrammarPointsEach()
	{
		return grammarPointsEach;
	}

	//This method returns the spelling points
	public double getSpellingPointsEach()
	{
		return spellingPointsEach;
	}

	//This method returns the correct length points
	public double getCorrectLengthPointsEach()
	{
		return correctLengthPointsEach;
	}

	//This method returne the content points
	public double getContentPointsEach()
	{
		return contentPointsEach;
	}

	//This method returns the missed points
	public int getNumMissed()
	{
		return numMissed;
	}

	/**
	* The adjustScore method adjusts a numeric score.
	* If the score is within 0.5 points of the next
	* whole number, it rounds the score up.
	*/

	private void adjustScore()
	{
		double fraction;	//Fractional part of a score

		//Get the fractional part of the score
		fraction = score - (int)score;

		//If the fractional part is 0.5 or greater
		//round the score up to the next whole number.
		if (fraction >= 0.5)
			score = score + (1.0 - fraction);
	}

} //End


