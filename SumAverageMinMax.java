//sumProductMinMax3
//incomeTaxCalculator
//incomeTaxCalculatorWithSentinel
//ReverseInt
//SalesTaxCalculator
//SumOfDigit


import java.util.Scanner;
class SumAverageMinMax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int n2 = sc.nextInt();
		System.out.print("Enter the 3rd number : ");
		int n3 = sc.nextInt();
		int sum = n1+n2+n3;
		System.out.println("The sum of 3 integers is : "+sum);
		double avg = sum/3.0;
		System.out.printf("The average of 3 integers is : %.2f\n",avg);
		if(n1>=n2 && n1>=n3)
		{
			System.out.println("The Max of 3 integers is : "+n1); 
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println("The Max of 3 integers is : "+n2); 
		}
		else
		{
			System.out.println("The Max of 3 integers is : "+n3); 
		}
		if(n1<=n2 && n1<=n3)
		{
			System.out.println("The Min of 3 integers is : "+n1); 
		}
		else if(n2<=n1 && n2<=n3)
		{
			System.out.println("The Min of 3 integers is : "+n2); 
		}
		else
		{
			System.out.println("The Min of 3 integers is : "+n3); 
		}
	}
}