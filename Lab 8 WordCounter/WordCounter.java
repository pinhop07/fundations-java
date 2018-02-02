import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter
{
	public static void main(String[] args)
	{

		String input; //to hold input

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string: ");
		input = keyboard.nextLine();

		System.out.print("That string has "
						 + wordCount(input)
						 + "words in it.");

	}

	public static int wordCount(String str)
	{
		StringTokenizer strTok = new StringTokenizer(str);
		return strTok.countTokens();
	}

}