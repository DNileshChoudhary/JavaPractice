import java.util.*;
class IncomeTaxCalculatorWithSentinel
{
	public static void main(String args[])
	{
		final int SENTINEL=-1;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Tax Payable Income(or -1 to end) : $");
		int income=sc.nextInt();
		double tax=0.0;
		while (income!=SENTINEL)
		{
			if (income<=20000)
			{ 
				tax=0.0;
			}
			else if(income<=40000)
			{
				tax=20000.0*0.0+(income-20000)*0.1;
			}
			else if (income<=60000)
			{
				tax=20000*0.1+(income-40000)*0.2;
			}
			else
			{
				tax=20000*0.1+20000*0.2+(income-60000)*0.3;
			}
			System.out.printf("The Income Tax Payable is : $%.2f\n",tax);
			System.out.print("Enter the Tax Payable Income(or -1 to end) : $");
			income=sc.nextInt();
		}
		System.out.print("Bye!");
	}
}