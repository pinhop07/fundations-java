public class TestPressure
{
	public static void main(String[] args)
	{

		Pressure p = new Pressure();

		p.setForce(172.5);

		p.setArea(27.5);

		System.out.println("The force is:"
						   + p.getForce());

		System.out.println("The area is:"
						   + p.getArea());

		System.out.println("The pressure is:"
						   + p.getPresure());

	}

}