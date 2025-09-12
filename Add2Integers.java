import java.util.Scanner;
class Add2Integers
{
	public static void main(String args[])
	{
		int number1;
		int number2;
		int sum;
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter First Number:" + "\t");
		number1= sc1.nextInt();
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter Second Number:"  +"\t");
		number2= sc2.nextInt();
		sum=number1 + number2;
		System.out.println("Sum of the 2 Integers:" +sum);
	}
}