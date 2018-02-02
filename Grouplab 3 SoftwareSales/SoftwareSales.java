// Paul Pinho October 14, 2009

/*
*  Fir this lab I am creating a SoftwareSales class
*  that will be able to accept in a program the
*  amount of units sold, calculate the discount,
*  and return the total cost of the purchase.
*  The class will contian a constructor that will
*  accept the amount of units sold, and hold the
*  value of the unit cost. The class will contain
*  an accessor method which will be able to obtain
*  the value of units sold. It will also have a get
*  discount method wich will use an if statement to
*  calculate the discount rate as well as the discount.
*  Finally it will contian a cost method to calculate
*  the total cost of the units sold.
*/

public class SoftwareSales
{
	private double	unitsSold;				//Software Sales Units Sold
	private final double UNITCOST = 99.0;	//Cost per single Unit


public SoftwareSales(double units)

	{
		unitsSold = units;
	}

	// The getUnitsSold returns the value of UnitsSold
	public double getUnitsSold()
	{
		return unitsSold;
	}

	/*
	* The getDiscount method calculates the discountRate
	* using an if statement. Then calculates the discount,
	* and returns it's value.
	*/

	public double getDiscount()
	{
		double 	discountRate,
				discount;

		if (unitsSold < 9)
			discountRate = 0.00;
		else if (unitsSold < 19)
			discountRate = 0.20;
		else if (unitsSold < 49)
			discountRate = 0.30;
		else if (unitsSold < 99)
			discountRate = 0.40;
		else
			discountRate = 0.50;

		discount = (unitsSold * UNITCOST) * discountRate;

		return discount;
	}

	// The getCost method calculates the cost and returns the value
	public double getCost()
	{
		double 	calculateCost,
				cost;

		cost = (unitsSold * UNITCOST) - getDiscount();

		return cost;
	}

} //End