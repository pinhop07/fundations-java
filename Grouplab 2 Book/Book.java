// Paul Pinho September 30, 2009

/**
* Book class
* This class stimulates a Book.
*/

public class Book
{

		private int yearModel;		//Year Manufactured
		private String make;		//Isbn of Book


		/**
		* The setYear method accepts an
		* argument that is stored in the
		* Year field.
		*/

		public void setyearModel(int yearmod)
		{
			yearModel = yearmod;
		}

		/**
		* The setISBN method accepts an
		* argument that is stored in the
		* ISBN field.
		*/

		public void setmake(String mak)
		{
			make = mak;
		}


		/**
		* The getYear returns the value
		* stored in the Year field
		*/

		public int getyearModel()
		{
			return yearModel;
		}

		/**
		* The getISBN returns the value
		* stored in the ISBN field
		*/

		public String getmake()
		{
			return make;
		}

}	//End





