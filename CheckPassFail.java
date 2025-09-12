class CheckPassFail
{
	public static void main(String args[])
	{
		int mark=30;
		{
			System.out.println("The Marks is "+mark);
			if (mark>=35)
			{
				System.out.println("PASS");
				System.out.println("Congratulations");
			}else
			{
				System.out.println("FAIL");
				System.out.println("Appear once again");
			}System.out.println("DONE");
		}
	}
}