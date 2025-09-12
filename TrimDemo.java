class TrimDemo
{
	public static void main(String args[])
	{
		String s="   Nilesh   ";
		System.out.println(s);
		System.out.println("Before Trim : "+s.length());
		System.out.println("After Trim : "+s.trim().length());
	}
}