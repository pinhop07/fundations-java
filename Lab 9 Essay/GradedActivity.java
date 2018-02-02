/**
* This is a class that hold a
* grade for a graded activity.
*/

public class GradedActivity
{
	protected double score;	//numeric score

	/**
	* The setScore method store its
	* value in the score field.
	*/

	public void setScore(double s)
	{
		score = s;
	}

	//The get score method returns the score field
	public double getScore()
	{
		return score;
	}

	/**
	* The getGrade method returns a letter
	* grade determined from the score field.
	*/

	public char getGrade()
	{
		char letterGrade;	//To hold the grade

		if (score >= 90)
			letterGrade = 'A';
		else if(score >= 80)
			letterGrade = 'B';
		else if (score >= 70)
			letterGrade = 'C';
		else if (score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';

		return letterGrade;
	}

} //End