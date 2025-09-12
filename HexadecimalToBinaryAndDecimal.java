public class HexadecimalToBinaryAndDecimal
{
	public static void main(String args[])
	{	//convert Hexadecimal to Binary and Decimal
		convertHexadecimalToBinaryAndDecimal("1234");//1234
		convertHexadecimalToBinaryAndDecimal("80F");//80F
		convertHexadecimalToBinaryAndDecimal("ABCDE");//ABCDE
	}
	// Function to convert Hexadecimal to Binary and Decimal
	public static void convertHexadecimalToBinaryAndDecimal(String hex)
	{
		int decimal=Integer.parseInt(hex,16);
		String binary=Integer.toBinaryString(decimal);
		System.out.println("Hexadecimal : " + hex + " -> Decimal : " + decimal + " -> Binary : " + binary);
	}
}