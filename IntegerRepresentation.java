public class IntegerRepresentation 
{
   
   public static void main(String[] args)
   {
		// Exercise 1: Ranges for different bit-sized integers in unsigned and signed representations
		displayIntegerRanges();
   
		// Exercise 2: 8-bit unsigned representation for specific values
		displayUnsigned8BitValues();
   
		// Exercise 3: 8-bit signed (2's complement) representation for specific values
		displaySigned8BitTwosComplementValues();
   
		// Exercise 4: 8-bit sign-magnitude representation for specific values
		displaySigned8BitSignMagnitudeValues();
   
		// Exercise 5: 8-bit 1's complement representation for specific values
		displaySigned8BitOnesComplementValues();
	}
   
	// Function to display the ranges of 8-bit, 16-bit, 32-bit, and 64-bit integers (unsigned and signed)
	public static void displayIntegerRanges() 
	{
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("8-bit signed range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("8-bit unsigned range: 0 to "+(0xFF)); // 255
		System.out.println();
		System.out.println("16-bit signed range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("16-bit unsigned range: 0 to " +(0xFFFF)); // 65535
		System.out.println();
		System.out.println("32-bit signed range: " + Integer.MIN_VALUE + " to " +Integer.MAX_VALUE);
		System.out.println("32-bit unsigned range: 0 to " +(0xFFFFFFFFL)); // 4294967295
		System.out.println();
		System.out.println("64-bit signed range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println("64-bit unsigned range: 0 to " +(Long.MAX_VALUE * 2 + 1));// 18446744073709551615
		System.out.println("---------------------------------------------------------------------------------");
	}
   
   // Function to display values in 8-bit unsigned representation
   public static void displayUnsigned8BitValues() 
	{
		System.out.println("88 in 8-bit unsigned: " + toUnsigned8Bit(88));
		System.out.println();
		System.out.println("0 in 8-bit unsigned: " + toUnsigned8Bit(0));
		System.out.println();
		System.out.println("1 in 8-bit unsigned: " + toUnsigned8Bit(1));
		System.out.println();
		System.out.println("127 in 8-bit unsigned: " + toUnsigned8Bit(127));
		System.out.println();
		System.out.println("255 in 8-bit unsigned: " + toUnsigned8Bit(255));
		System.out.println("---------------------------------------------------------------------------------");
	}
  
	// Function to display values in 8-bit 2's complement signed representation
	public static void displaySigned8BitTwosComplementValues() 
	{
		System.out.println("+88 in 8-bit 2's complement: " +toSigned8BitTwosComplement(88));
		System.out.println();
		System.out.println("-88 in 8-bit 2's complement: " +toSigned8BitTwosComplement(-88));
		System.out.println();
		System.out.println("-1 in 8-bit 2's complement: " + toSigned8BitTwosComplement(-1));
		System.out.println();
		System.out.println("0 in 8-bit 2's complement: "+ toSigned8BitTwosComplement(0));
		System.out.println();
		System.out.println("+1 in 8-bit 2's complement: " + toSigned8BitTwosComplement(1));
		System.out.println();
		System.out.println("-128 in 8-bit 2's complement: " +toSigned8BitTwosComplement(-128));
		System.out.println();
		System.out.println("+127 in 8-bit 2's complement: " +toSigned8BitTwosComplement(127));
		System.out.println("---------------------------------------------------------------------------------");
	}
    
	// Function to display values in 8-bit sign-magnitude representation
	public static void displaySigned8BitSignMagnitudeValues() 
	{
		System.out.println("+88 in 8-bit sign-magnitude: " + toSignMagnitude(88));
		System.out.println();
		System.out.println("-88 in 8-bit sign-magnitude: " + toSignMagnitude(-88));
		System.out.println();
		System.out.println("-1 in 8-bit sign-magnitude: " + toSignMagnitude(-1));
		System.out.println();
		System.out.println("0 in 8-bit sign-magnitude: "+ toSignMagnitude(0));
		System.out.println();
	    System.out.println("+1 in 8-bit sign-magnitude: " + toSignMagnitude(1));
		System.out.println();
	    System.out.println("-127 in 8-bit sign-magnitude: " + toSignMagnitude(-127));
		System.out.println();
	    System.out.println("+127 in 8-bit sign-magnitude: " + toSignMagnitude(127));
	    System.out.println("---------------------------------------------------------------------------------");
	}
   
	// Function to display values in 8-bit 1's complement representation
	public static void displaySigned8BitOnesComplementValues() 
	{
		System.out.println("+88 in 8-bit 1's complement: " + toOnesComplement(88));
		System.out.println();
		System.out.println("-88 in 8-bit 1's complement: " + toOnesComplement(-88));
		System.out.println();
		System.out.println("-1 in 8-bit 1's complement: " + toOnesComplement(-1));
		System.out.println();
		System.out.println("0 in 8-bit 1's complement: "+ toOnesComplement(0));
		System.out.println();
		System.out.println("+1 in 8-bit 1's complement: " + toOnesComplement(1));
		System.out.println();
		System.out.println("-127 in 8-bit 1's complement: " + toOnesComplement(-127));
		System.out.println();
		System.out.println("+127 in 8-bit 1's complement: " + toOnesComplement(127));
		System.out.println("---------------------------------------------------------------------------------");
	}
   
	// Helper method for 8-bit unsigned representation
	public static String toUnsigned8Bit(int value)
	{
		return String.format("%8s", Integer.toBinaryString(value & 0xFF)).replace(' ','0');
    }
    
	// Helper method for 8-bit 2's complement signed representation
	public static String toSigned8BitTwosComplement(int value)
	{
		return String.format("%8s", Integer.toBinaryString(value & 0xFF)).replace(' ','0');
	}
    
	// Helper method for 8-bit sign-magnitude representation
	public static String toSignMagnitude(int value)
	{
		int signBit =(value < 0)? 1 : 0;
		int magnitude = Math.abs(value);
		String binaryMagnitude = String.format("%7s", Integer.toBinaryString(magnitude)).replace(' ', '0');
		return signBit + binaryMagnitude;
    }
    
	// Helper method for 8-bit 1's complement representation
	public static String toOnesComplement(int value)
	{
		if (value >= 0)
		{
		return String.format("%8s", Integer.toBinaryString(value)).replace(' ','0');
		}
		else 
		{
		// Invert bits for negative numbers
		return String.format("%8s", Integer.toBinaryString(~(-value)& 0xFF)).replace(' ', '0');
		}
	}
}
 