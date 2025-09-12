public class DecimalToBinaryFloatingPoint
{
	public static void main(String [] args)
	{
		//convert Decimal to Binary with Floating Point
		convertDecimalToBinaryFloating(123.456D);//123.456D
		convertDecimalToBinaryFloating(19.25D);//19.25D
	}
	//Functions to convert Decimal To Binary with Floating Point
	public static void convertDecimalToBinaryFloating(double decimal)
	{
		//split the decimal into Integer Fractional parts
		int integerPart=(int) decimal;
		double fractionalPart= decimal - integerPart;
		
		//Convert integer part to binary
		String binaryInteger= Integer.toBinaryString(integerPart);
		
		//convert fractional part into binary
		StringBuilder binaryFraction = new StringBuilder();          
		while (fractionalPart > 0 && binaryFraction.length() < 10) 
		{ 
			// Limiting the fraction to 10 bits
              fractionalPart *= 2;
              if (fractionalPart >= 1) 
			  {
					binaryFraction.append(1);
					fractionalPart -= 1;
              }
			  else 
			  {
                   binaryFraction.append(0);
              }
        }
  
           // Combine integer and fractional parts
          System.out.println("Decimal: " + decimal + " -> Binary: " + binaryInteger + "." + binaryFraction);
       }
}