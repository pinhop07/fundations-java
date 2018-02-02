import java.io.*;
import java.util.Scanner;

public class TestScoreFile
{
	public static void main(String[] args)throws IOException
	{
		int[] testScores = {76, 89, 150, 135, 200,
							76, 12, 100, 150, 28,
							178, 189, 167, 200, 150,
							87, 99, 129, 149, 176,
							200, 87, 35, 175, 189};

		PrintWriter outputFile = new PrintWriter("scores.txt");

		for (int index = 0; index < testScores.length; index++)
		{
			outputFile.println(testScores[index]);
		}

		outputFile.close();
	}

}