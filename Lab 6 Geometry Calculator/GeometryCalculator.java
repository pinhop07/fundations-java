/**
* For this class I will be using three
* different ststaic methods that
* will calculate the area of three different
* objects.  The first method finds the area
* of a circle, the radius will be passed
* through the r parameter and pi will be
* passed through the pi parameter.  The method
* returns the area of the circle.  The second
* method accepts the lengeth and width which
* will be passed through the l and w parameter.
* The method returns the area of a rectangle.
* The third method gets the base and hight of
* a triangle which will be passed through the
* b and h parameters. The method returns the
* area of a triangle.
**/

public class GeometryCalculator
{

	//This method will calculate the area of a circle

	public static double CircleArea(double pi, int r)
	{
		return Math.PI * (r * r);
	}

	//This method will calculate the area of a rectangle

	public static int RectangleArea(int l, int w)
	{
		return l * w;
	}

	//This meathod will calculate the area of a triangle

	public static double TriangleArea(int b, int h)
	{
		return 0.5 * b * h;
	}

} //End