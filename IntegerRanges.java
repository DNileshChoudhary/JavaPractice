public class IntegerRanges
{
	public static void main(String args[])
	{
	// Exercise 1: Ranges for different bit-sized integers in unsigned and signed representations
		displayIntegerRanges();
	}

// Function to display the ranges of 8-bit, 16-bit, 32-bit, and 64-bit integers (unsigned and signed)
	public static void displayIntegerRanges() 
	{
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
	}
}