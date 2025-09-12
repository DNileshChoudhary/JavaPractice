//to count number of vowels and consonants in the given string
class Count
{
	public static void main(String args[])
	{
		int vctr=0,cctr=0;
		String vs,cs;
		vs="";
		cs="";
		String s;
		s=args[0];
		s=s.toUpperCase();
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			char ch;
			ch=s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				vctr++;
				vs=vs+" "+ch;
			}
			else
			{
				cctr++;
				cs=cs+" "+ch;
			}
			
		}	System.out.println("Vowel in "+s+" = "+vs);
			System.out.println("Consosants in "+s+" = "+cs);
			System.out.println("Number of Vowels in "+s+" = "+vctr);
			System.out.println("Number of Consonants in "+s+" = "+cctr);
	}
}
