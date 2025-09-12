import java.util.*;
class ReverseInt
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.print("\nEnter a Positive Integer : ");
		num= sc.nextInt();
		String number=Integer.toString(num);
		for(int i = number.length()-1;i>=0;i--)
		{
			System.out.print(number.charAt(i));
		}
	}
}