/**
* This program will test the Employee class
**/

public class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee num1, num2, num3; //Holds the values for three employees

		//Get the information of employee 1
		num1 = new Employee("Susan Meyers", 47899,
							"Accounting", "Vice President");
		System.out.println("Employee 1:");
		System.out.println("Name: " + num1.getName());
		System.out.println("ID Number: " + num1.getIDnumber());
		System.out.println("Department: " + num1.getDepartment());
		System.out.println("Position: " + num1.getPosition());
		System.out.println();

		//Get the information for employee 2
		num2 = new Employee("Mark Jones", 39119);
		System.out.println("Employee 2:");
		System.out.println("Name: " + num2.getName());
		System.out.println("ID Number: " + num2.getIDnumber());
		System.out.println("Department: " + num2.getDepartment());
		System.out.println("Position: " + num2.getPosition());
		System.out.println();

		//Get the information for employee 3
		num3 = new Employee();
		System.out.println("Employee 2:");
		System.out.println("Name: " + num3.getName());
		System.out.println("ID Number: " + num3.getIDnumber());
		System.out.println("Department: " + num3.getDepartment());
		System.out.println("Position: " + num3.getPosition());
		System.out.println();

	}


} //End
