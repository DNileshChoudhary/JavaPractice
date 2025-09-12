//String---------compareTo()
//unicode/ASCII cod---------(lexicographically it checks)
//A-65 B-66 C-67 D-68...................Z=90
//a-97 b-98 c-99 d-100..................z=122
class NewDemo1
{
	public static void main(String args[])
	{
		String s = new String("Krishna");
		String t = new String("KRISHNA");
		int v;
		v=s.compareTo(t);
		if(v==0)
		{
			System.out.println("Both are EQUAL");
		}
		else if (v<0)
		{
			System.out.println("First is smaller than econd");
		}
		else
		{
			System.out.println("First is greater than Second");
		}
	}
}