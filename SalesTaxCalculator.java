import java.util.*;
class 	SalesTaxCalculator
{
	public static void main(String args[])
	{
		final double Sales_Tax_Rate=0.07;
		final double Sentinel=-1;
		double price , actualPrice,salesTax;
		double totalPrice=0.0,totalActualPrice=0.0,totalSalesTax=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the tax-inclusive price in dollars(or -1 to end) : ");
		price = sc.nextDouble();
		while( price != Sentinel )
		{
			actualPrice= price/(Sales_Tax_Rate+1);
			salesTax= price-actualPrice;
			System.out.printf("\nActual Price is : $%.2f",actualPrice);
			System.out.printf(", Sales Tax is : $%.2f\n",salesTax);
			
			totalPrice=totalPrice+price;
			totalActualPrice=totalActualPrice+actualPrice;
			totalSalesTax=totalSalesTax+salesTax;
			System.out.print("\nEnter the tax-inclusive price in dollars(or -1 to end) : ");
			price=sc.nextDouble();
			
		}
		System.out.printf("\nTotal Price is : $%.2f\n",totalPrice);
		System.out.printf("\nTotal Actual Price is : $%.2f\n",totalActualPrice);
		System.out.printf("\nTotal Sales Tax is : $%.2f\n",totalSalesTax);
		
	}
}