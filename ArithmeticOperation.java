+ ArithmeticOperation
{
	public static void main(String args[])
	{
		int a,b;
		a = Integer.parseInt (args[0]);
		b = Integer.parseInt (args[1]);
		System.out.println("Arithmetic Operations");
		System.out.println("Sum = " + (a+b) );
		System.out.println("Difference = " + (a-b) );
		System.out.println("Product = " +(a*b) );
		System.out.println("Division = " +(a/b) );
		System.out.println("Mod = " +(a%b) );
	}
}