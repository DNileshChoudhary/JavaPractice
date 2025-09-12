//1-Dimensional Array
class MyMark4
{
	public static void main (String args[])
	{
		int marks[]={1,2,3,4,5};
		int tot=0;
		for(int i=0;i<marks.length;i++)
		{
			tot=tot+marks[i];
		}
			System.out.println("Total Marks : "+tot);
			float avg;
			avg=tot/(float)marks.length;
			System.out.printf("Average=%.2f",avg);
	}
}