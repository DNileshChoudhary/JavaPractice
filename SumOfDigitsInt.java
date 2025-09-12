import java.util.*;
class SumOfDigitsInt
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.print("\nEnter a Positive Integer : ");
		num= sc.nextInt();
		String number=Integer.toString(num);
		int sumOfdigits=0;
		for(int i = number.length()-1;i>=0;i--)
		{
			char a=number.charAt(i);
			String b = Character.toString(a);
			int numb=Integer.parseInt(b);
			sumOfdigits=sumOfdigits+numb;
			
			
		}
		System.out.println("The sum of digits is : "+sumOfdigits);
	}
}