/**
* For this lab I am creating an Employee class
* that will be able to accept in a program the
* name, ID number, department, and position of
* three employees and return the fields that
* corresponds to it. The class will contain
* three constructors that will accept the name,
* ID number, positionm and department. It will
* have set and get methods for each one of the
* fields.
**/

public class Employee
{
	private String name;		//Hodls the name
	private int idNumber;		//Holds the ID Number
	private String department;	//Holds the department
	private String position;	//Holds the position

	/**
	* The following constructor accepts three String arguments
	* that are assigned to the name, department, and position
	* fields and one int argument that is assigned to the
	* idNumber field.
	**/

	public Employee(String nam, int idNum, String dep, String pos)
	{
		name = nam;
		idNumber = idNum;
		department = dep;
		position = pos;
	}

	/**
	* The following constructor accepts a String argument
	* that is assigned to the name field and an int
	* argument that is assigned to the idNumber field.
	**/

	public Employee(String nam, int idNum)
	{
		name = nam;
		idNumber = idNum;
		department = "";
		position = "";
	}

	/**
	* The following constructor assigns 0 to the Idnumber field.
	**/

	public Employee()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}


	//Accepts an argument stored in the name field
	public void setName(String nam)
	{
		name = nam;
	}

	//Accepts an argument stored in the idNumber field
	public void setIDnumber(int idNum)
	{
		idNumber = idNum;
	}

	//Accepts an argument stored in the department field
	public void setDepartment(String dep)
	{
		department = dep;
	}

	//Accepts an argument stored in the position field
	public void setPosition(String pos)
	{
		position = pos;
	}

	//Returns the value of the name
	public String getName()
	{
		return name;
	}

	//Returns the value of the idNumber
	public int getIDnumber()
	{
		return idNumber;
	}

	//Returns the value of the department
	public String getDepartment()
	{
		return department;
	}

	//Returns the value of the postion
	public String getPosition()
	{
		return position;
	}

} //End


