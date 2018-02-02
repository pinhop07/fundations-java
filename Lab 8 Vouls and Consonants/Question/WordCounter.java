//Paul Pinho Lab 8, November 19, 2009, CISY 105 - 1X

/**
* This program is designed to accpet a String
* object as an argument and return the number
* of words it contains.
**/

import java.util.Scanner;			//Needed for Scanner class.
import java.util.StringTokenizer;	//Needed to tokenize String.

public class WordCounter
{
	public static void main(String[] args)
	{

		String input; //to hold input.

		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		//Get a String from the user.
		System.out.print("Enter a string: ");
		input = keyboard.nextLine();

		//Display the result.
		System.out.print("That string has "
						 + wordCount(input)
						 + " words in it.");

	}

	public static int wordCount(String str)
	{
		//Create a StringTokenizer object.
		//The String to be tokenized is str.
		StringTokenizer strTok = new StringTokenizer(str);
		return strTok.countTokens();
	}

} //End