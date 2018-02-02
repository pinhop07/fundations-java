/** The program performs the operation selected by the user and
repeats until the user selects e, to exit the program
*/

import java.util.Scanner;

public class VowelsConsDemo
{
    public static void main (String[] args)
    {
        String str; // for the input
        char [] array;
        int vol = 0;
        int cons = 0;
        int volCons = 0;
        char pick;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a letter of you choice.");
        str = keyboard.nextLine();


        VowelCons stuff = new VowelCons(input);


        do
        {
            System.out.println("The number of vowels are " + stuff.getNumVowels());
            System.out.println("The number of consonants are " + stuff.getNumConsonants());
            System.out.println("The number of vowels and consonants are " + stuff.countVowelsAndCons());



            System.out.println("If you want to continue, Press E");
            str = keyboard.nextLine();
            pick = str.charAt(0); // get the first char

          if(str.equalsIgnoreCase("E"))
          {

            System.out.println("Please enter a letter of you choice.");
            str = keyboard.nextLine();

          }

          keyboard.nextLine();





        } while (Character.toUpperCase(pick) == 'E');





    }
}
