class Result
{
	public static void main(String args[])
	{
		int pass_mark=30;
		int my_mark;
		my_mark = Integer.parseInt(args[0]);
		if (my_mark >= pass_mark)
		{
			System.out.println(" PASS ");
		}
		else
		{
			System.out.println(" FAIL ");
		}
	}
}