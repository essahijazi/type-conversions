
public class Main {

	public static void main(String[] args) {
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;
		
		short result1 = byteVal; //widening conversion
		// result1 = longVal; narrowing conversion, this will not work without
		//explicit narrowing using casting
		result1 = (short) longVal; //explicit narrowing conversion
		
		//result1 = byteVal - longVal; this will not work as the answer will be
		//a long as that is the largest integer type in the equation, and a long
		//cannot be implicitly narrowed without casting

		result1 = (short)(byteVal - longVal);
		
		//float result2 = longVal - doubleVal; this will not work as the answer will be
		//a double as that is the largest integer type in the equation, and a double
		//cannot be implicitly narrowed without casting
		
		float result2 = (float)(longVal - doubleVal); //first fix is to explicitly cast the answer to a float
		double result3 = longVal - doubleVal; //second fix is to change the data type of result to the largest type 
		//being used in the equation which in this example is a double
		
		System.out.println("Success");
	}

}
