
public class MyTempConverter {

		public static void main(String[] args) 
		{
			//multiline comment to describe function of class.
			/**This program will convert Fahrenheit temperature to Celsius.
			 * using the formula 
			 * C = (F-32)/(5/9)
			*/
			// Create a variable for the constant 32 in the equation thats an int. 
			final int BASE_VALUE = 32;// Constants should be in snake case CAPS_AND_UNDERSCORES.
			// Create a variable for the constant value that is the expression 9/5.
			final double CONVERSION_FACTOR = 9.0 / 5.0;
			
			// Declare a double in which you will store the result of your calculation.
			double celsiusTemp;// Variable names should be in camelCase. 
			// Value to convert, set an input value you wish to convert in an int variable called FahrenheitTemp.
			int fahrenheitTemp = 78;
			// Computer equation using variables that store the literal values. 
			celsiusTemp = ((fahrenheitTemp-BASE_VALUE)/CONVERSION_FACTOR);// C = (F-32)/(9/5)
			// Print out original value you input to be converted
			System.out.println("The Temperature of " + fahrenheitTemp + "F is equal to:" );
			// Print out the resulting variable in Celsius.
			System.out.println(celsiusTemp + "C degrees Celsius.");
		}
}
