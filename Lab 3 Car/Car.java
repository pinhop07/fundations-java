// Paul Pinho October 7, 2009

/*
* For this lab I am creating a Car class
* that will be able to demonstrate in a
* program, the make, year model, and speed
* of the car. It will also be able to take
* the the value of the speed, accelerate
* and decelerate it. The class will contain
* a constructor that will accept the car's
* year model, make and speed. The class
* will also contain three methods, an accessor
* meathod, which will obtain the values stored
* in the object's year model, make, and speed
* fields. There will also be an accelerate and
* break meathod that will be able to accelerate
* and delcelerate the car by values of five.
*/


public class Car
{

		private int yearModel;	//Car's Year Model
		private String make;	//Car's Manufacturer
		private int speed;		//Speed the Car travels

		/*
		* The constructor initializes the yearModel,
		* make, and speed fields with the values
		* of yearmod, mak, and sped.
		*/

		public Car(int yearmod, String mak,int sped)
		{
			yearModel = yearmod;
			make = mak;
			speed = sped;
		}


		//The getyearModel returns the value of the Year Model

		public int getyearModel()
		{
			return yearModel;
		}

		//The getmake returns the value of the Make

		public String getmake()
		{
			return make;
		}

		//The getspeed returns the value of the Speed

		public int getspeed()
		{
			return speed;
		}

		/*
		* The getAccelerate method adds 5 to the speed
		* and returns the value in the accelerate field
		*/

		public int getAccelerate()
		{
			int accelerate;

			accelerate = speed + 5;

			return accelerate;
		}

		/*
		* The getBrake method subtracts 5 from the speed
		* and returns the value in the brake field
		*/

		public int getBrake()
		{
			int brake;

			brake = speed - 5;

			return brake;
		}

}	//End





