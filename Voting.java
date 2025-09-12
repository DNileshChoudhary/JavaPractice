import java.util.*;
class Voting
{
	public static void main(String []args)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nationality : ");
		String nationality;
		nationality=sc.next();
		nationality=nationality.toLowerCase();
		if (nationality.equals("indian" ))
		{
			int age;
			System.out.println("Enter your Age : ");
			age=sc.nextInt();
			if (age>=18)
			{
				System.out.println("Yes, Eligible for Voting");
			}
			else
			{
				System.out.println("Not Eligible,Age is <18");
			}
		}
		else
		{
			System.out.println("Not Eligible, Non-Indian");
		}
	}
}