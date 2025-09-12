public class BinaryToHexadecimalAndDecimal
{
	public static void main(String args[])
	{
		// Convert Binary To Hexadecimal And Decimal
		convertBinaryToHexadecimalAndDecimal("10000000");//10000000
		convertBinaryToHexadecimalAndDecimal("101010101010");//101010101010
		convertBinaryToHexadecimalAndDecimal("1000011000");//1000011000
	}
	//Functions To convert Binary To Hexadecimal And Decimal
	public static void convertBinaryToHexadecimalAndDecimal(String binary)
	{
		int decimal=Integer.parseInt(binary,2);
		String hexadecimal=Integer.toHexString(decimal).toUpperCase();
		System.out.println("Binary : "+binary  +" ->HexaDecimal : "+hexadecimal +" ->Decimal : "+decimal);
	}
}