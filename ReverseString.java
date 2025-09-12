import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.next();
		System.out.print("The reverse String of the \""+s+"\" is : \"");
		for (int i = s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.print("\".");
	}
}