class cnt
{
	public static void main(String args[])
	{
		long cnt = 0;
		for(long i = 0 ; i<1000000000; i++)
		{
			cnt+=i;
		}
		System.out.println(cnt);
	}
}