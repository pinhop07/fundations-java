//Paul Pinho December 1, 2009, CISY 105 - 1X

/**
*  The VowelCons class will contain a constructor
*  that accepts a String object as its argument.
*  The class will contain two methods, one that
*  will return the number of vowels in the String,
*  and another method that will return the number
*  of consonants in the String.
**/

public class VowelCons
{
    private char[] vowels = { 'A', 'E', 'I', 'O', 'U'};
    private char[] consonants = {'B', 'C', 'D', 'F', 'G',
    							 'H', 'J', 'K', 'L', 'M',
    							 'N', 'P', 'Q', 'R', 'S',
    							 'T', 'V', 'W', 'X', 'Y',
    							 'Z'};
    private int numVowels = 0;
    private int numCons = 0;

	// Vowel and Consonants constructor.
    public VowelCons(String str)
    {
		countVowels(str);
		countConsonants(str);
    }

    //Get number of vowels.
    public int getNumVowels()
    {
        return numVowels;
    }

    //Get number of consonants.
    public int getNumConsonants()
    {
        return numCons;
    }

    //Count vowels mutator method
    public void countVowels(String str)
    {
		boolean vowelFound;

		for (int i = 0; i < str.length(); i++)
	    {
			vowelFound = false;

			for (int v = 0; v < vowels.length; v++)
			{
				if (Character.toUpperCase(str.charAt(i)) == vowels[v])
	        	{
					numVowels++;
	        	    vowelFound = true;
				}
			}
		}
	}

	//Count consonants mutator method
	public void countConsonants(String str)
	{
		boolean consonantFound;

		for (int i = 0; i < str.length(); i++)
		{
			consonantFound = false;

			for (int c = 0; c < consonants.length; c++)
			{
				if (Character.toUpperCase(str.charAt(i)) == consonants[c])
				{
					numCons++;
					consonantFound = true;
				}
			}
		}
	}

} //End




