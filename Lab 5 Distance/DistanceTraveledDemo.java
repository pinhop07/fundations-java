import java.util.Scanner;

public class DistanceTraveledDemo
{
	public static void main(String[] args)
	{
		double 	speed;
		int 	maxHours,
				period;


		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the speed the car travels? ");
		speed = keyboard.nextDouble();

		while (speed < 0)
		{
			System.out.println("Please do not enter a negative number. ");

			System.out.print("Enter the speed the car travels. ");

			speed = keyboard.nextDouble();
		}


		System.out.print("How many hours have you traveled? ");
				maxHours = keyboard.nextInt();

		while (maxHours <= 0)
		{
			System.out.println("That is not a valid answer. ");

			System.out.print("Enter how many hours you have traveled. ");

			maxHours = keyboard.nextInt();
		}


		System.out.println("Hours		Distance Traveled");
		System.out.println("---------------------------------");

		period = 1;

		while (period <= maxHours)
		{
			DistanceTraveled d = new DistanceTraveled(speed, period);

			System.out.println(period + "\t\t" + d.getDistance());

			period ++;
		}

	}
}