public class DistanceTraveled
{
	private double speed;
	private int hours;
	private double distance;


	public DistanceTraveled(double s, int h)
	{
		speed = s;
		hours = h;
	}

	public void setSpeed(double s)
	{
		speed = s;
	}

	public void setHours(int h)
	{
		hours = h;
	}

	public double getSpeed()
	{
		return speed;
	}

	public int getHours()
	{
		return hours;
	}

	public double getDistance()
	{
		distance = (speed * hours);

		return distance;
	}
}


