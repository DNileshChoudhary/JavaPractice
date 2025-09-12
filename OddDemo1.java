class  OddDemo1
{
	public static void main(String []args)
	{
		for (int i=1 ;i<=1000; i++)
		{if (i<=500 || i>=550)
		{
			if (i%2==1)
			{System.out.print(i+"\t");}
		
		}
		if (i==500)
		{
			System.out.println("\n-----------------------------------------------");
		}
		}
	}
}