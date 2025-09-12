//1-Dimensional Array
class MyMark
{
	public static void main (String args[])
	{
		int marks[];
		marks=new int[5];
		int tot=0;
		marks[0]=1;
		marks[1]=2;
		marks[2]=3;
		marks[3]=4;
		marks[4]=5;
		tot=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
		System.out.println("Total Marks : "+tot);
	}
}