import java.util.*;
class IncomeTaxCalculator
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Taxable Income : $");
		int income=sc.nextInt();
		double tax=calculateTaxableIncome(income);
	}
	public static double calculateTaxableIncome(int income)
	{	double tax=0.0;
		if(income <= 20000)
		{
			System.out.println("The Income Tax Payable is : $0.0");
		}
		else if(income<=40000)
		{
			tax=20000.0*0.0+(income-20000)*0.1;
			System.out.printf("The Income Tax Payable is : $%.2f\n",tax);
		}
		else if (income<=60000)
		{
			tax=20000*0.1+(income-40000)*0.2;
			System.out.printf("The Income Tax Payable is : $%.2f\n",tax);
		}
		else 
		{
			tax=20000*0.1+20000*0.2+(income-60000)*0.3;
			System.out.printf("The Income Tax Payable is : $%.2f\n",tax);
		}
		return tax;
	}
}