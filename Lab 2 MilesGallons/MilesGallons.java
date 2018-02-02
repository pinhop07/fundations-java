// Lab 2 Paul Pinho September 20, 2009
// Miles Per Gallon

import java.util.Scanner; //program uses class Scanner

public class MilesGallons
{
   // main method begins execution of Java application
      public static void main( String args[] )
      {
        //create scanner to obtain the amount of miles per gallon
        Scanner input = new Scanner(System.in );

        int miles; // enter miles
        int gallons; // enter gallons
        int MPG; //find amount of miles per gallon

        System.out.print("Enter Miles:"); //prompt
        miles = input.nextInt(); //read amount of miles from user

        System.out.print("Enter Gallons:"); //prompt
        gallons = input.nextInt(); //read amount of gallons from user

        MPG = miles / gallons; //calculate miles per gallon
        System.out.printf( "Miles per Gallon is %d\n", MPG );

        } // end method main

        } // end class MilesGallons