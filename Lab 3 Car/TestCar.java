/**
* This program will test the Car class
*/


public class TestCar
{
	public static void main(String[] args)
	{


	//Create a newcar object
	Car mycar = new Car(2005, "BMW", 0);

		//Get the year the car was manufactured
		System.out.println("The year the car"
							+ "was manufactured:"
							+ mycar.getyearModel());


		//Get the make of the car
		System.out.println("The make of the car is:"
							+ mycar.getmake());


		//Get the speed of the car
		System.out.println("The speed the car travels"
							+ "at is:"
							+ mycar.getspeed());



				//Get the acceleration of the car
				System.out.println("The speed the car "
									+ "accelerates is:"
									+ mycar.getAccelerate());

				System.out.println("Then the speed the car "
									+ "accelerates to is:"
									+ mycar.getAccelerate() * 2);


				System.out.println("Then the speed the car "
									+ "accelerates to is"
									+ mycar.getAccelerate() * 3);

				System.out.println("Then the speed the car "
									+ "accelerates to is:"
									+ mycar.getAccelerate() * 4);


				System.out.println("Then the speed the car "
									+ "accelerates to is:"
									+ mycar.getAccelerate() * 5);



				//Get the deceleration of the car
				System.out.println("The speed the car "
									+ "brakes to is:"
									+ mycar.getBrake());

				System.out.println("Then the speed the car "
									+ "brakes to is:"
									+ mycar.getBrake() * 2);


				System.out.println("Then the speed the car "
									+ "brakes to is:"
									+ mycar.getBrake() * 3);

				System.out.println("Then the speed the car "
									+ "accelerates is:"
									+ mycar.getBrake()* 4);


				System.out.println("Then the speed the car "
									+ "brakes to is:"
									+ mycar.getBrake() * 5);


	}

} //End

