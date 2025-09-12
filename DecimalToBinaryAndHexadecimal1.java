public class DecimalToBinaryAndHexadecimal1
{
	public static void main(String[] args)
	{
		// Convert Decimal to Binary and Hexadecimal
		convertDecimalToBinaryAndHexadecimal(108); // 108
		convertDecimalToBinaryAndHexadecimal(4848); // 4848
		convertDecimalToBinaryAndHexadecimal(9000); // 9000
    }
    
	// Function to convert Decimal to Binary and Hexadecimal
	public static void convertDecimalToBinaryAndHexadecimal(int decimal)
	{
		String binary = Integer.toBinaryString(decimal);
		String hexadecimal = Integer.toHexString(decimal).toUpperCase();
		System.out.println("Decimal: " + decimal + " -> Binary: " + binary + " -> Hexadecimal: " + hexadecimal);
    }
}