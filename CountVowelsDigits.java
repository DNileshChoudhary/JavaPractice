import java.util.*;
class CountVowelsDigits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String : ");
		String s = sc.next().toLowerCase();
		int length= s.length()-1;
		int digits=0,vowels=0;
		for(int i = length ; i >=0 ; i--)
		{
			char ch = s.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			if (ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
			{
				digits++;
			}
		}
			double vowelsPercent= ((double)vowels/(length+1))*100.00;
			double digitsPercent= ((double)digits/(length+1))*100.00;
			System.out.print("Number of Vowels : "+vowels +" (");
			System.out.format("%.2f",vowelsPercent);
			System.out.println("%)");
			System.out.print("Number of Digits : "+digits+" (");
			System.out.format("%.2f",digitsPercent);
			System.out.print("%)");
	}
}