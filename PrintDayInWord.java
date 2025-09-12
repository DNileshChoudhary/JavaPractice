class PrintDayInWord
{
	public static void main(String args[])
	{
		int day=6;
		{
			System.out.println("Given day is "+day);
			if(day==0)
			{
				System.out.println("Day in word : Sunday");
			}
			else if(day==1)
			{
				System.out.println("Day in word : Monday"); 
			}
			else if(day==2)
			{
				System.out.println("Day in word : Tuesday"); 
			}
			else if(day==3)
			{
				System.out.println("Day in word : Wednesday"); 
			}
			else if(day==4)
			{
				System.out.println("Day in word : Thursday"); 
			}
			else if(day==5)
			{
				System.out.println("Day in word : Friday"); 
			}
			else if(day==6)
			{
				System.out.println("Day in word : Saturday"); 
			}
			else 
			{
				System.out.println("It is not a Day,Try again!"); 
			}
		}
	}
}