//give 5 marks bonus for attendence >= 75
//read attendence and marks from cmd line
//print total marks
class Marks
{
	public static void main(String args[])
	{
		int att,mark,bonus,tot_marks;
		att=Integer.parseInt(args[0]);
		mark=Integer.parseInt(args[1]);
		if (att >= 75)
		{	
			bonus=5;
			{
				System.out.println("tot_marks="+(bonus+mark) );				
			}
		}
		else
		{	
			bonus=0;
			{
				System.out.println("tot_marks=" + (bonus+mark) );
			}
		}
	
		
	}
}