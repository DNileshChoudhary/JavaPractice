//1-Dimensional Array
class MyMark2
{
	public static void main (String args[])
	{
		int marks[]={1,2,3,4,5};
		int tot=0;
		for(int i=0;i<5;i++)
		{
			tot=tot+marks[i];
		}
			System.out.println("Total Marks : "+tot);
	}
}