class OddDemo
{
	public static void main(String []args)
	{	
		for (int i=1 ;i<=1000;i++)
		{ if (i%2==1)
		{
			System.out.print(i+"\t");
		}
		if(i>=500)
		{
		break;
		}
		}
	}
}