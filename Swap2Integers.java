import java.util.*;
class Swap2Integers
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 1st Integer : ");
		int n1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter 2nd Integer : ");
		int n2 = sc2.nextInt();
		int temp = n1 ;
		n1 = n2;
		n2 =temp;
		System.out.println("After the swap,1st Integer is : "+n1);
		System.out.println("After the swap,2nd Integer is : "+n2);
	}
}