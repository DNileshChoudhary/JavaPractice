import java.util.*;
class PensionCalculatorWithSentinel
{
	public static void main(String args[])
	{
		final int SENTINEL=-1;
		int salary,age;
		double employeeContribution,employerContribution,totalContribution;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Monthly Salary(or -1 to end) : $");
		salary=sc.nextInt();
		while(salary!=SENTINEL)
		{	System.out.print("Enter the Age : ");
			age=sc.nextInt();
			if(age<=55)
			{
				employeeContribution=salary*0.2;
				employerContribution=salary*0.17;
				totalContribution=employeeContribution+employerContribution;
				System.out.printf("The Employee's contribution is : $%.2f\n",employeeContribution);
				System.out.printf("The Employer's contribution is : $%.2f\n",employerContribution);
				System.out.printf("The Total contribution is : $%.2f\n",totalContribution);
			}
			else if(age<=60)
			{
				employeeContribution=salary*0.13;
				employerContribution=salary*0.13;
				totalContribution=employeeContribution+employerContribution;
				System.out.printf("The Employee's contribution is : $%.2f\n",employeeContribution);
				System.out.printf("The Employer's contribution is : $%.2f\n",employerContribution);
				System.out.printf("The Total contribution is : $%.2f\n",totalContribution);
			}
			else if(age<=65)
			{
				employeeContribution=salary*0.075;
				employerContribution=salary*0.09;
				totalContribution=employeeContribution+employerContribution;
				System.out.printf("The Employee's contribution is : $%.2f\n",employeeContribution);
				System.out.printf("The Employer's contribution is : $%.2f\n",employerContribution);
				System.out.printf("The Total contribution is : $%.2f\n",totalContribution);
			}
			else
			{
				employeeContribution=salary*0.05;
				employerContribution=salary*0.075;
				totalContribution=employeeContribution+employerContribution;
				System.out.printf("The Employee's contribution is : $%.2f\n",employeeContribution);
				System.out.printf("The Employer's contribution is : $%.2f\n",employerContribution);
				System.out.printf("The Total contribution is : $%.2f\n",totalContribution);
			}
			System.out.print("Enter the Monthly Salary(or -1 to end) : $");
			salary=sc.nextInt();
		}
		System.out.println("Bye!");
		
	}
}