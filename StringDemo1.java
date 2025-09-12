//String Method---charAt();
class StringDemo1
{
	public static void main(String args[])
	{
		String s="Nilesh";
		s=s.toUpperCase();
		System.out.println(s);
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
		}
		s=s.toLowerCase();
	System.out.println(s);
	}
}