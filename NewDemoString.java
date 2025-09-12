//use new operator to allocate memory
//use of equals()
class NewDemoString
{
	public static void main(String args[])
	{
		String s=new String("Krishna");
		String t=new String("Rama");
		if(s.equals(t))
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("Not EQUAL");
		}
	}
}