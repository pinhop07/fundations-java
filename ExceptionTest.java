public class ExceptionTest
{
	public static void main(String[] args)
	{
		int number;
		String str;

		try
		{
			str = "xyz";
			number = Integer.parseInt(str);
			System.out.println("A");
		}

		catch