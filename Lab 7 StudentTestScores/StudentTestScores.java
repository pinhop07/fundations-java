import java.util.Scanner;
import java.io.*;

public class StudentTestScores
{
	public static void main(String[] args) throws IOException
	{
		final int STUDENT_SCORES = 26;
		int range024 = 0,
			numbers024 = 0,
			numbers2549 = 0,
			numbers5074 = 0,
			numbers7599 = 0,
			numbers100124 = 0,
			numbers125149 = 0,
			numbers150174 = 0,
			numbers175200 = 0;
		int[] testScores = new int[STUDENT_SCORES];
		int index = 0;

		File file = new File("scores.txt");

		Scanner inputFile = new Scanner(file);

		while (inputFile.hasNext() && index < testScores.length)
		{
			testScores[index] = inputFile.nextInt();
			index++;
		}

		inputFile.close();

		for (index = 0; index < testScores.length; index++)
		{
			if(testScores[index] >= 0 && testScores[index] <= 24)
			{
				numbers024++;
			}

			else if(testScores[index] >= 25 && testScores[index] <= 49)
			{
				numbers2549++;
			}

			else if(testScores[index] >= 50 && testScores[index] <= 74)
			{
				numbers5074++;
			}

			else if(testScores[index] >= 75 && testScores[index] <= 99)
			{
				numbers7599++;
			}

			else if(testScores[index] >= 100 && testScores[index] <= 124)
			{
				numbers100124++;
			}

			else if(testScores[index] >= 125 && testScores[index] <= 149)
			{
				numbers125149++;
			}

			else if(testScores[index] >= 150 && testScores[index] <= 174)
			{
				numbers150174++;
			}

			else if(testScores[index] >= 175 && testScores[index] <= 200)
			{
				numbers175200++;
			}
		}

		System.out.println("There were " + numbers024 + " students with score 0-24.");
		System.out.println("There were " + numbers2549 + " students with score 25-49.");
		System.out.println("There were " + numbers5074 + " students with score 50-74.");
		System.out.println("There were " + numbers7599 + " students with score 75-99.");
		System.out.println("There were " + numbers100124 + " students with score 100-124.");
		System.out.println("There were " + numbers125149 + " students with score 125-149.");
		System.out.println("There were " + numbers150174 + " students with score 150-174.");
		System.out.println("There were " + numbers175200 + " students with score 175-200.");

	}

}


