/** Wrie a class with a constructor that accepts a String object as its argument.
*/

public class VowelCons2
{//start of the VowelCons class
    private char[] vowels = { 'A', 'E', 'I', 'O', 'U'};

    private char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
                                 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W',
                                 'X', 'Y', 'Y', 'Z'};
    private int numCons = 0; // the integer for the number of consonants is 0
    private int numVowels = 0; // the integer for the vowels is 0


    // Vowel and Consonants constructor
    public VowelCons2(String str)
    {// start VowelCons constructor
        countVowelsAndCons(str);
    }//end Vowels constructor

    // numCons accessor method

    public int getNumCons()
    {
        return numCons;
    }

    // getNumVowels accessor method

    public int getNumVowels()
    {
        return numVowels;
    }

    // countVowelsAndCons mutator method

    public void countVowelsAndCons(String str)
    {// start of countVowelsAndCons method
        boolean vowelFound;

        for (int i = 0; i < str.length(); i++)

        {//start of str loop

        vowelFound = false;


           for (int v = 0; v < vowels.length; v++)

           {// start of the vowels loop


            if (Character.toUpperCase(str.charAt(i)) == vowels[v])
            {// start of vowels if statement
                numVowels++;
                vowelFound = true;
			}
            else
			 {// start vowels not found if statement
			  for (int z = 0; z < consonants.length; z++)
			     {//start of the consonants for loop
			          if (Character.toUpperCase(str.charAt(i)) == consonants[z])
			                    {// start of the consonants if statement
			                        numCons++;
			                    }// end of the consonants if statement
			                }//end of the consonants for loop
			            }//end of the vowels not found if statement
			        }// end of the str loop
			    }//end of the countVowelsAndCons method
			}// End of the VowelsCons Class

            }// end vowels if statement







