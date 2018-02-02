import java.util.Scanner;

public class Distance
{
	public static void main( String args[] )
    {
		Scanner input = new Scanner(System.in );

        int speed;
        int time;
        int distance;

        System.out.print("Enter speed:");
        speed = input.nextInt();

        System.out.print("Enter time:");
        time = input.nextInt();

        distance = speed * time;
        System.out.print( "Distance traveled is: " + distance );
	}

}