/**
* This program demonstrates the GeometryCalculator class
**/

import java.util.Scanner;

public class GeometryCalculatorDemo
{
	public static void main(String[] args)
	{

		double	PI;			//Value of PI
		int 	radius,		//Value of radius
				length,		//Value of length
				width,		//Value of width
				base,		//Value of base
				hight;		//Value of hight


			//Create a Scanner object for the keyboard input
			Scanner keyboard = new Scanner(System.in);

			//Get the value of the radius
			System.out.print("Enter the radius of the circle: ");
			radius = keyboard.nextInt();

			//Validate the radius
			while (radius < 0)
			{
				System.out.println("Please do not enter a negative number. ");

				System.out.print("Enter the radius of the circle: ");

				radius = keyboard.nextInt();
			}

			PI = Math.PI;

			//Calculate the area of the circle
			System.out.println("The area of the circle is: "
							  + GeometryCalculator.CircleArea(PI,radius)
							  + " square meters.");


			//Get the value of the length
			System.out.print("Enter the length of the rectangle: ");
			length = keyboard.nextInt();

			//Validate the length
			while (length < 0)
			{
				System.out.println("Please do not enter a negative number. ");

				System.out.print("Enter the length of the rectangle: ");

				length = keyboard.nextInt();
			}

			//Get the value of the width
			System.out.print("Enter the width of the rectangle: ");
			width = keyboard.nextInt();

			//Validate the width
			while (width < 0)
			{
				System.out.println("Please do not enter a negative number. ");

				System.out.print("Enter the width of the rectangle: ");

				width = keyboard.nextInt();
			}

			//Calculate the area of the rectangle
			System.out.println("The area of the rectangle is: "
							  + GeometryCalculator.RectangleArea(length,width)
							  + " square meters.");


			//Get the value of the base
			System.out.print("Enter the base of the triangle: ");
			base = keyboard.nextInt();

			//Validate the base
			while (base < 0)
			{
				System.out.println("Please do not enter a negative number. ");

				System.out.print("Enter the base of the triangle: ");

				base = keyboard.nextInt();
			}

			//Get the value of the hight
			System.out.print("Enter the hight of the triangle: ");
			hight = keyboard.nextInt();

			//Validate the hight
			while (hight < 0)
			{
				System.out.println("Please do not enter a negative number. ");

				System.out.print("Enter the hight of the triangle: ");

				hight = keyboard.nextInt();
			}

			//Calculate the area of the triangle
			System.out.println("The area of the triangle is: "
							  + GeometryCalculator.TriangleArea(base,hight)
							  + " square meters.");
	}

} //End
