class BreakDemo
{
	public static void main(String []args)
	{
	for (int i=0 ;i<1000;i=i+10)
	{
		System.out.print(i+"\t");
		if (i>=500)
		{
		break;
		}
	}
	}
}