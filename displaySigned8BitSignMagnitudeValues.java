public class displaySigned8BitSignMagnitudeValues
{
	public static void main(String[] args)
   {
   
		// Exercise 5: 8-bit 1's complement representation for specific values
		displaySigned8BitOnesComplementValues();
	}
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