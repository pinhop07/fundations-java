

	// Lets Open Her Up
class JN42_2

     	{
	public static void main ( String[] args )
       		{

    String turn = "player";
    int total = 0;
    int total2 = 0;
    int player = 0;
    int computer = 0;
    int countingperrrrrty = 0;
    String output = "";

 	total = (int)  (Math.random() * (15) + 30);
 	total = total2;

        while ( total2 > 0)
    {

    while (turn == "player")
    {
    	while ( total2 >= 3)
    		{
				while (player == 1 || player == 2 || player == 3)
				{
	player = IO.getInt("Please Enter A Number Between 1 and 3");
	total2 = total2 - player;
	turn = "computer";
				}
      		}

          	while ( total2 >= 2)
          	{
          		while (player == 1 || player == 2)
				{
	player = IO.getInt("Please Enter A Number Between 1 and 2");
	total2 = total2 - player;
	turn = "computer";
				}
    		}


    		while ( total2 >= 1)
          	{
          		while (player == 1 || player == 2)
				{
	player = IO.getInt("Please Enter The Number 1");
	total2 = total2 - player;
	turn = "computer";
				}
    		}
    }


    while (turn == "computer")
    {
    	while ( total2 >= 3)
    		{
				while (computer == 1 || computer == 2 || computer == 3)
				{
	computer = (int)  (Math.random() * (1) + 3);
	total2 = total2 - computer;
	turn = "player";
				}
      		}

          	while ( total2 >= 2)
          	{
          		while (computer == 1 || computer == 2)
				{
	computer = (int)  (Math.random() * (1) + 2);
	total2 = total2 - computer;
	turn = "player";
				}
    		}


    		while ( total2 >= 1)
          	{
          		while (computer == 1 || computer == 2)
				{
	computer =                                                                                               1;
	total2 = total2 - computer;
	turn = "player";
				}
    		}
    }

}
    IO.showMsg(total2);

  }

}
