import java.util.*;
public class CheckPassFailDyn
{ // Save as "CheckPassFailDyn.java"
	public static void main(String[] args)
	{   int mark ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		mark = sc.nextInt();
		System.out.println("The mark is " + mark);
		if ( mark >= 50)
		{
			System.out.println( "PASS" );
		}
		else
		{
			System.out.println( "FAIL" );
		}
	}
}