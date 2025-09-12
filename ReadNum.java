import java.util.*;
class ReadNum
{
	public static void main(String args[])
	{
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter N1:  ");
		int n1=sc.nextInt();
		System.out.println("Enter N2:  ");
		int n2=sc.nextInt();
		System.out.println("Enter N3:  ");
		int n3=sc.nextInt();
		float avg;
		avg=(n1+n2+n3)/3.0f;
		System.out.printf("Average = %.2f",avg);
	}
}