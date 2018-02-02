import java.util.Scanner;

public class MyQuestionDemo
{
	public static void main(String[] args)
	{
		String question;


		Scanner keyboard = new Scanner(System.in);

		System.out.print("Who do you love? ");
		question = keyboard.nextLine();

		while (question == "Paul")
		{
			System.out.println("Try again! ");

			System.out.print("Who do you love? ");

			question = keyboard.nextLine();
		}


	}
}